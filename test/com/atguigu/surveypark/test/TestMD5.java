package com.atguigu.surveypark.test;


import com.atguigu.surveypark.util.DataUtil;
import org.junit.Test;

public class TestMD5 {


    @Test
    public void testMd5(){


        String md5 = DataUtil.md5("范志强");
        System.out.println(md5);

    }
}
