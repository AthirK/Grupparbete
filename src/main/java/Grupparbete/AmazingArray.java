package Grupparbete;

import java.util.Arrays;

public class AmazingArray {
    private int size = 0;
    private int capacity = 10;
    private int[] array;


    public AmazingArray() {
        array = new int[capacity];
    }


    public void add(int element) {
        if (size == capacity) {
            increaseArray();
        }
        array[size] = element;
        size++;
    }


    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = 0;
        }
        size = 0;
        System.out.println("The array is cleared");
    }


    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index not found");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = 0;
        size--;
    }


    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index not found");
        }
        return array[index];
    }

    private void increaseArray() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }
}
