package com.example.demoProject.model;

public class Course {
    private long id;
    private String name;
    private String authour;
    public Course(){

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    public Course(long id, String name, String authour) {
        this.id = id;
        this.name = name;
        this.authour = authour;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthour() {
        return authour;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authour='" + authour + '\'' +
                '}';
    }
}
