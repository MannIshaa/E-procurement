package com.example.otimus.opendataproject.models;

/**
 * Created by Otimus on 2/25/2017.
 */

public class District {

    Integer id;
    String districtName;
    Integer availableProjects;

    public District(Integer id, String districtName, Integer availableProjects) {
        this.id = id;
        this.districtName = districtName;
        this.availableProjects = availableProjects;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Integer getAvailableProjects() {
        return availableProjects;
    }

    public void setAvailableProjects(Integer availableProjects) {
        this.availableProjects = availableProjects;
    }
}
