package com.sv.son;

import java.util.List;

public class Semester {
    public Semester(String name) {
        this.name = name;
    }

    private String name;

    private List<Course> coursesInSemester;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCoursesInSemester() {
        return coursesInSemester;
    }

    public void setCoursesInSemester(List<Course> coursesInSemester) {
        this.coursesInSemester = coursesInSemester;
    }

    public void display() {
        System.out.println("ten hk : " + getName());
    }

}