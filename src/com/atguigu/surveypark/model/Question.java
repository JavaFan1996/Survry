package com.atguigu.surveypark.model;


/**
 * 问题类
 */
public class Question {


    private Integer id;
    private int questionType;

    private String title;

    private String options;

    private boolean other;

    private int otherStyle;


    private String otherSelectOptions;


    private String matrixColTitles;

    private String matrixSelectOptions;


    //建立从Page到question的一对多关系
    private Page page;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuestionType() {
        return questionType;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public int getOtherStyle() {
        return otherStyle;
    }

    public void setOtherStyle(int otherStyle) {
        this.otherStyle = otherStyle;
    }

    public String getOtherSelectOptions() {
        return otherSelectOptions;
    }

    public void setOtherSelectOptions(String otherSelectOptions) {
        this.otherSelectOptions = otherSelectOptions;
    }

    public String getMatrixColTitles() {
        return matrixColTitles;
    }

    public void setMatrixColTitles(String matrixColTitles) {
        this.matrixColTitles = matrixColTitles;
    }

    public String getMatrixSelectOptions() {
        return matrixSelectOptions;
    }

    public void setMatrixSelectOptions(String matrixSelectOptions) {
        this.matrixSelectOptions = matrixSelectOptions;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
