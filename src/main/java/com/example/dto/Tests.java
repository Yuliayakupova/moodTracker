package com.example.dto;

import java.util.List;

public class Tests {

    private String testName;
    private List<Questions> questions;

    public Tests(String testName, List<Questions> questions) {
        this.testName = testName;
        this.questions = questions;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }
}
