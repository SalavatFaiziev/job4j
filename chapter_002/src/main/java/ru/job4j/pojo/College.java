package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John Doe");
        s.setGroup("First");
        s.setCreated("1.09.2012");
        System.out.println("Name: " + s.getName() + System.lineSeparator() + "Group: " + s.getGroup() + System.lineSeparator() + "Date: " + s.getCreated());
    }
}