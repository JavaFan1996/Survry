package com.atguigu.surveypark.serviceimpl;

import com.atguigu.surveypark.dao.BaseDao;
import com.atguigu.surveypark.service.BaseService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 抽象的BaseService，专门用于继承
 * @param <T>
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {


    private BaseDao<T> Dao;

    //注入Dao
    @Resource
    public void setDao(BaseDao<T> dao) {
        this.Dao = dao;

    }


    @Override
    public void saveEntity(T t) {
        Dao.saveEntity(t);

    }

    @Override
    public void saveOrUpdateEntity(T t) {

        Dao.saveOrUpdateEntity(t);
    }

    @Override
    public void updateEntity(T t) {

        Dao.updateEntity(t);
    }

    @Override
    public void deleteEntity(T t) {

        Dao.deleteEntity(t);

    }

    @Override
    public void bathchEntityByHQL(String HQL, Object... objects) {

        Dao.bathchEntityByHQL(HQL, objects);

    }

    @Override
    public T loadEntity(Integer id) {
        return Dao.loadEntity(id);
    }

    @Override
    public T getEntity(Integer id) {
        return Dao.getEntity(id);
    }

    @Override
    public List<T> findEntityByHQL(String HQL, Object... objects) {
        return Dao.findEntityByHQL(HQL, objects);
    }
}
