package com.atguigu.surveypark.model;

import java.util.HashSet;
import java.util.Set;

public class Page {
    private Integer id;
    private String title = "未命名";
    private String description;

    //建立从Page到Survey的多对一的关系
    private Survey survey;

    //建立从Page到question的一对多的关系
    private Set<Question> questions = new HashSet<>();


    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
