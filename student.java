package com.collection;

import java.util.Objects;

public class student implements Comparable<student>{
    int rollno;
    String name;

    public student(String name,int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
     @Override
     public String toString() {
         return name +""+rollno;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }


    @Override
    public int compareTo(student o) {
        return this.rollno - o.rollno;
        //return this.name.compareTo(o.name);
    }
}
