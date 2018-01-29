package com.model;

import com.model.Lesson;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/12/28 0028.
 */
public class Student implements Serializable {
    private int stuID;
    private String name;
    private Set<Lesson> lessons = new HashSet<>();

    public Student() {
    }

    public Student(int stuID, String name, Set<Lesson> lessons) {
        this.stuID = stuID;
        this.name = name;
        this.lessons = lessons;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Set<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", name='" + name + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}
