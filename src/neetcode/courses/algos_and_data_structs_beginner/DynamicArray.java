package neetcode.courses.algos_and_data_structs_beginner;

public class DynamicArray {
    private int capacity;
    private int length;
    private int[] array;

    public DynamicArray() {
        this.capacity = 2; // assume the dynamic array capacity always starts at 2
        this.length = 0;
        this.array = new int[this.capacity];
    }

    public void push(int num) {
        if (length == capacity) {
            this.resize();
        }
        array[length++] = num;
    }

    public void pushAtIndex(int num, int index) {
        if (index == length) {
            this.push(num);
        }
        if (index >= 0 && index < length) {
            for (int i = length - 1; i > index; i--) {
                if (i + 1 > capacity) {
                    this.resize();
                }
                array[i + 1] = array[i];
            }
            array[index] = num;
        }
    }

    public void resize() {
        capacity = 2 * capacity;
        int[] newArray = new int[capacity];

        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void pop() {
        if (length > 0) {
            length--;
        }
    }

    public void popAtIndex(int index) {
        if (index == length - 1) {
            this.pop();
        }
        if (index >= 0 && index < length) {
            for (int i = index + 1; i < length; i++) {
                array[i - 1] = array[i];
            }
            length--;
        }
    }

    public int getValueAt(int index) {
        if (index < length) {
            return array[index];
        }
        return -1; // exception can be implemented for out of bounds error
    }

    public void show() {
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}
