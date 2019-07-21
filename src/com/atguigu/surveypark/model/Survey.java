package com.atguigu.surveypark.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * 调查类
 */
public class Survey {


    private Integer id;
    private String title = "未命名";
    private String preText = "上一步";
    private String nextTex = "下一步";
    private String exitText = "退出";
    private String doneText = "完成";
    private Date creatTime = new Date();


    //简历从调查到用户之间的多对一的关联
    private User user;

    private Set<Page> pages = new HashSet<Page>();


    public Set<Page> getPages() {
        return pages;
    }

    public void setPages(Set<Page> pages) {
        this.pages = pages;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreText() {
        return preText;
    }

    public void setPreText(String preText) {
        this.preText = preText;
    }

    public String getNextTex() {
        return nextTex;
    }

    public void setNextTex(String nextTex) {
        this.nextTex = nextTex;
    }

    public String getExitText() {
        return exitText;
    }

    public void setExitText(String exitText) {
        this.exitText = exitText;
    }

    public String getDoneText() {
        return doneText;
    }

    public void setDoneText(String doneTexy) {
        this.doneText = doneTexy;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
