package com.sv.son;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> students;
    private String name;
    private String id;

    public Course(String name, String id) {
        this.name = name;
        this.id = id;
        this.students = new ArrayList<Student>();
    }


    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }


    public void display() {
        System.out.println("ten mon hoc: " + getName());
        System.out.println("ma mon hoc: " + getId());
        System.out.println("danh sach hoc sinh :");
        for (Student student : students){
            student.display();
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
