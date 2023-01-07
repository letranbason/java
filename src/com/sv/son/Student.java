package com.sv.son;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int id;
    private List<Course> Courses;


    public List<Course> getCourses() {
        return Courses;
    }

    public void setCourses(List<Course> courses) {
        Courses = courses;
    }



    public Student(String name, int id) {
        super(name);
        this.id = id;
        this.Courses = new ArrayList<Course>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void addCourse(Course course){
        this.Courses.add(course);
        course.addStudent(this);
    }



    public void display() {
        System.out.println("id :" + getId());
        System.out.println("Danh sach mon hoc : ");
        for (Course course : getCourses()){
            course.display();
        }
    }
}
