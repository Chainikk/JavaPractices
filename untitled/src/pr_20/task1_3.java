package pr_20;

import java.lang.System;
import java.io.Serializable;
interface Animal {}

class Cat implements Animal, Serializable {}

class GenericClass<T extends Comparable, V extends Serializable & Animal, K> {
    private T value1;
    private V value2;
    private K value3;

    public GenericClass(T value1, V value2, K value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }

    public K getValue3() {
        return value3;
    }

    public void setValue3(K value3) {
        this.value3 = value3;
    }

    public void printClassNames() {
        System.out.println("Type of value1: " + getValue1());
        System.out.println("Type of value2: " + getValue2());
        System.out.println("Type of value3: " + getValue3());
    }

    public static void main(String[] args) {
        // Пример использования обобщенного класса
        GenericClass<String, Cat, Integer> example = new GenericClass<>("Hello", new Cat(), 123);
        example.printClassNames();
    }
}



