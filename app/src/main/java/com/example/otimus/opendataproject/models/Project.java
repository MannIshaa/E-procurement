package com.example.otimus.opendataproject.models;

/**
 * Created by Otimus on 2/25/2017.
 */

public class Project {
    Integer id;
    String projectName;
    String date;

    public Project(Integer id, String projectName, String date) {
        this.id = id;
        this.projectName = projectName;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

