package com.atguigu.surveypark.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;

public class TestDataSource {




    /**
     * 测试数据源是否添加成功
     *
     * @throws SQLException
     */
    @Test
    public void getConnection() throws SQLException {

        System.out.println(new Date());
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        DataSource dataSource = (DataSource) context.getBean("dataSource");

        System.out.println(dataSource.getConnection());
        System.out.println(new Date());



    }


}
