package com.atguigu.surveypark.daoimpl;

import com.atguigu.surveypark.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public  abstract class BaseDaoImpl<T>  implements BaseDao<T> {


    //注入sessionFactory
    @Resource
    private SessionFactory sessionFactory;
    private Class<T> clazz;

    public BaseDaoImpl(){

        //得到带泛型的超类
        /*
        此时的This是指实现了BaseDaoImpl的一个实现类，比如UserDaoImpl extends BaseDaoImpl<User>
        获得的超类指的是 BaseDaoImpl<User>
        再得到这个超类的泛型
         */
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) type.getActualTypeArguments()[0];
    }


    @Override
    public void saveEntity(T t) {
        sessionFactory.getCurrentSession().save(t);

    }

    @Override
    public void saveOrUpdateEntity(T t) {

        sessionFactory.getCurrentSession().saveOrUpdate(t);

    }

    @Override
    public void updateEntity(T t) {

        sessionFactory.getCurrentSession().update(t);

    }

    @Override
    public void deleteEntity(T t) {

        sessionFactory.getCurrentSession().delete(t);

    }

    @Override
    public void bathchEntityByHQL(String HQL, Object... objects) {

        Query query = sessionFactory.getCurrentSession().createQuery(HQL);
        for (int i = 0; i < objects.length; i++) {
            query.setParameter(i, objects[i]);
        }
        query.executeUpdate();
    }

    @Override
    public T loadEntity(Integer id) {
        return (T) sessionFactory.getCurrentSession().load(clazz, id);

    }

    @Override
    public T getEntity(Integer id) {
        return (T) sessionFactory.getCurrentSession().get(clazz, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findEntityByHQL(String HQL, Object... objects) {
        Query query = sessionFactory.getCurrentSession().createQuery(HQL);
        for (int i = 0; i < objects.length; i++) {
            query.setParameter(i, objects[i]);
        }
        return query.list(

        );

    }
}
