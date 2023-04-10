package com.bridgelabz.methods;

public class ArraySort {
    static void arraysort() {

        int arr[] = {1, 2, 45, 4, 5, 6, 47, 32};
        for (int i = 0, j = i + 1; i < arr.length; i++, j++) {

            // for (int j = i + 1; j < arr.length; j++) {
            int temp = 0;

            if (arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.print(arr[i] + " ");

        }

    }





    public static void main(String[] args) {
        arraysort();
    }
}
