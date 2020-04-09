/**
 * Повышающее приведение
 */
package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman fresh = new Freshman();
        Student stud = fresh;
        Object obj = fresh;
        System.out.println(new Freshman());
        System.out.println(new Student());
        System.out.println(new Object());
    }
}
