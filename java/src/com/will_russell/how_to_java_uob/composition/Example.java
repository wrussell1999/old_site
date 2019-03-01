package com.will_russell.how_to_java_uob.composition;

public class Example {

    public static void main(String[] args) {
        Student student1 = new Student("Will", 19);
        
        printStudent(student1);

        student1.setName("William");
        student1.setAge(20);

        printStudent(student1);
    }

    public static void printStudent(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}