package neetcode.courses.algos_and_data_structs_beginner.arrays;

import java.util.Arrays;

public class StaticArray {
    public static void main(String[] args) {
        // initializing an integer array
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(myArray));

        // accessing an element in myArray in O(1) time
        System.out.println(myArray[5]);

        // traversing myArray using a for loop
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // traversing myArray using an enhanced for loop
        for (int j : myArray) {
            System.out.println(j);
        }

        // traversing myArray using a while loop
        int i =0;
        while(i < myArray.length) {
            System.out.println(myArray[i]);
            i++;
        }

        // calling the method to remove the element from the end of the array
        removeFromEnd(myArray, myArray.length);
        System.out.println(Arrays.toString(myArray));

        // calling the method to remove the element from the ith position of the array
        removeAtIndex(myArray, 5, myArray.length);
        System.out.println(Arrays.toString(myArray));

        int numberToBeInserted = 555;

        // calling the method to insert at an element at the end of the array
        insertAtEnd(myArray, numberToBeInserted, findAvailableLengthOfArray(myArray), myArray.length);
        System.out.println(Arrays.toString(myArray));

        //calling the method to insert at an element(999) at ith position in the array
        insertAtIndex(myArray, 2, 999, findAvailableLengthOfArray(myArray), myArray.length);
        System.out.println(Arrays.toString(myArray));
    }

    /**
     * method to remove(soft delete) the last element from the provided integer array.
     * unfortunately the length of the array doesn't change using this approach.
     * we explicitly assume it's decreased by 1
     *
     * @param array
     * @param length
     */
    public static void removeFromEnd(int[] array, int length) {
        if (length > 0) {
            array[length - 1] = 0;
        }
    }

    /**
     * method to remove(soft delete) an element from the ith position in the provided integer array
     * unfortunately the length of the array doesn't change using this approach.
     * we explicitly assume it's decreased by 1
     *
     * @param array
     * @param index
     * @param length
     */
    public static void removeAtIndex(int[] array, int index, int length) {
        for (int i = index + 1; i < length; i++) {
            array[i - 1] = array[i];
        }
    }

    /**
     * helper method to find the total number of "real" values within an array
     *
     * @param array
     * @return number of "real" values in the array
     */
    public static int findAvailableLengthOfArray(int[] array) {
        int availableLength = 0;
        for (int number : array) {
            if (number != 0) {
                availableLength++;
            }
        }
        return availableLength;
    }

    /**
     * method to insert a number at the next open position
     *
     * @param array
     * @param input - number to be inserted
     * @param availableLength - number of "real" values in the array
     * @param capacity - size of the array
     */
    public static void insertAtEnd(int[] array, int input, int availableLength, int capacity) {
        if (availableLength < capacity) {
            array[availableLength] = input;
        }
    }

    /**
     * method to insert a number at the ith position
     * @param array
     * @param index - index at which the number will be inserted
     * @param input - number to be inserted
     * @param availableLength - number of "real" values in the array
     * @param capacity - size of the array
     */
    public static void insertAtIndex(int[] array, int index, int input, int availableLength, int capacity) {
        if (availableLength < capacity) {
            for (int i = availableLength - 1; i > index + 1; i--) {
                array[i + 1] = array[i];
            }
            array[index] = input;
        }
    }
}
