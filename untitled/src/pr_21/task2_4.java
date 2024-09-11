package pr_21;

import java.util.ArrayList;
import java.util.List;

class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public void setElement(int index, T element) {
        array[index] = element;
    }

    public T getElement(int index) {
        return array[index];
    }

    public T getAnyElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        }
        else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    public List<T> toArray() {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        GenericArray<Integer> integerArray = new GenericArray<>(5);
        integerArray.setElement(0, 1);
        integerArray.setElement(1, 2);
        integerArray.setElement(2, 3);

        System.out.println("Element at index 1: " + integerArray.getElement(1));
        System.out.println("Any element at index 1: " + integerArray.getAnyElement(1));

        GenericArray<String> stringArray = new GenericArray<>(3);
        stringArray.setElement(0, "Hello");
        stringArray.setElement(1, "World");
        stringArray.setElement(2, "!");

        System.out.println("Element at index 2: " + stringArray.getElement(2));
        System.out.println("Any element at index 2: " + stringArray.getAnyElement(2));

        List<Integer> integerList = integerArray.toArray();
        System.out.println("First 5 elements of integerList: " + integerList.subList(0, Math.min(5, integerList.size())));

        List<String> stringList = stringArray.toArray();
        System.out.println("First 5 elements of stringList: " + stringList.subList(0, Math.min(5, stringList.size())));
    }
}