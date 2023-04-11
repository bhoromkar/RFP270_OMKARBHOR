package com.bridgelabz.methods.RFP270_OMKARBHOR;

import java.util.Arrays;

public class Review {

    static void fibonacci(int num) {
        int number1 = 0;
        int number2 = 1;
        for (int i = 1; i <= num; ++i) {
            System.out.print(number1 + "  ");
            int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
        System.out.println();
    }

    public static void distinctElement(int arr[], int arr1[]) {
        // boolean distinctValue=false;
         int k = 0;
        //int arr[] = {1, 3, 5, 7, 57, 86 ,7 , 8, 17};
        //int arr1[] = {4, 6, 8, 9, 7, 68, 4, 1,320, 7, 17, 15, 5, 5};
        int arr2[] = new int[arr.length];
        //int arr2[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                boolean distinctValue = false;

                for (int j = 0; j < arr1.length; j++) {
                    if (arr[i] == arr1[j]) {
                        distinctValue = true;
                        break;
                    }
                }
               // if (distinctValue == true)
                if (distinctValue == true) {
                   // for (int k = 0; k < arr2.length; k++)
                   if(k<arr2.length)
                        arr2[k] = arr[i];
                            k++;
                    System.out.print(arr[i] + " ");

                }

            }
            System.out.println();
            System.out.println(Arrays.toString(arr2) + " this are distinct element");
//return arr2;
        }


    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 57, 86, 8, 17};
        int arr1[] = {4, 6, 8, 9, 7, 68, 4, 1, 320, 7, 17, 15, 5, 5};
        fibonacci(10);
        distinctElement(arr,arr1) ;
       // harmonic(15);
    }
}
