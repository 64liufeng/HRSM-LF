package com.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/12/28 0028.
 */
public class Lesson implements Serializable {
    private int lesID;
    private String leName;
    private Set<Student> students = new HashSet<>();

    public Lesson() {
    }

    public Lesson(int lesID, String leName, Set<Student> students) {
        this.lesID = lesID;
        this.leName = leName;
        this.students = students;
    }

    public int getLesID() {
        return lesID;
    }

    public void setLesID(int lesID) {
        this.lesID = lesID;
    }

    public String getLeName() {
        return leName;
    }

    public void setLeName(String leName) {
        this.leName = leName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lesID=" + lesID +
                ", leName='" + leName + '\'' +
                '}';
    }
}
