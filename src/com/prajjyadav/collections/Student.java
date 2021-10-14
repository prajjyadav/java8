package com.prajjyadav.collections;

import java.util.Objects;

class Student implements Comparable<Student> {
    String name;
    int roll;


    public Student() {
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }


    @Override
    public int compareTo(Student student) {
        // this compare to method must comply with equals there should be no discrepancy
        return name.compareTo(student.name);
        // so if we are doing something here and returning 0 then equals method should return true!!


        // if we compare like this then, all the names having same length will be considered equal and we will be losing them in set
        // and if we didn't return 0 for exactly same then we will be having duplicate
//        if(name.length() < student.name.length()){
//            return -1;
//        }
//        else if(name.length() > student.name.length()){
//            return 1;
//        }
//        else
//            return 0;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}
