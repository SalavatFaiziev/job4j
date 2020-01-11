package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
       int res = first > second ? first : second;
       int result = res > third ? res : third;
        return result;
    }
}
