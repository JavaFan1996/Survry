package com.atguigu.surveypark.dao;

import java.util.List;

/**
 * BaseDao接口
 * @param <T>
 */
public interface BaseDao<T> {


    //写操作
    public void saveEntity(T t);
    public void saveOrUpdateEntity(T t);
    public void updateEntity(T t);
    public void deleteEntity(T t);

    public void bathchEntityByHQL(String HQL, Object... objects);


    //读操作
    public T loadEntity(Integer id);

    public T getEntity(Integer id);

    public List<T> findEntityByHQL(String HQL, Object... objects);

}
