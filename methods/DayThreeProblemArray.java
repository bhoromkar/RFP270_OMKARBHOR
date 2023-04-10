package com.bridgelabz.methods;
import java.util.Arrays;
public class DayThreeProblemArray {
    static void printelement(){
        int[] arr={1,5,15,79,31,19,36,72,4,84,15,17,15,19,57,25};
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+ " ");
                }
        System.out.println();
    }
    static void sumarray() {
        int[] arr = {1, 5, 15, 79, 31, 19, 36, 72, 4, 84, 15, 17, 15, 19, 57, 25};
        int sum = 0;
        {
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println("sum of element in array is: " +sum);
        }
    }
    static void maxnum(){
        int[] arr={1,5,15,79,31,19,36,72,4,84,15,17,15,19,57,25};
        int large=0;
        for(int i=0;i<arr.length;i++){
           // for(int j=i+1;j<arr.length;j++){
                if(arr[i]>large){
                    large=arr[i];

            }
        }
        System.out.println("largest" +large);
    }
    static void minnum(){
        int[] arr={100,5,15,79,31,19,36,72,4,84,15,17,15,19,57,25};
        int small=arr[0];
        for(int i=1;i<arr.length;i++){
            // for(int j=i+1;j<arr.length;j++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.print(small);
    }


    static void evenposition() {

        System.out.println("******************************************************************************************");

        int[] arr = {100, 5, 15, 79, 31, 19, 36, 72, 4, 84, 15, 17, 15, 19, 57, 25};
        System.out.print("even num in array are : ");
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.print(arr[i] + " ");

            }

        }
        System.out.println(" ");
    }
    static void reversearray(){
        int[] arr = {100, 5, 15, 79, 31, 19, 36, 72, 4, 84, 15, 17, 15, 19, 57, 25};
        System.out.print("reverse element are : ");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i] + " ");


        }
        System.out.println(" ");
    }
    static void oddposition() {


        int[] arr = {100, 5, 15, 79, 31, 19, 36, 72, 4, 84, 15, 17, 15, 19, 57, 25};
        for (int i = 0; i < arr.length; i++) {
            if(i%2==1){
                System.out.print(arr[i] + " ");

            }

        }
        System.out.println(" ");
    }

    static void duplicate() {


        int[] arr = {100, 5, 15, 79, 31, 19, 36, 72, 4, 84, 15, 17, 15, 19, 57, 25};
        for (int i = 0,j=0; i < arr.length; i++,j++) {
                          arr[j]=arr[i];
            System.out.print(arr[j] + " ");
        }
        System.out.println(" ");
    }
    static void arraysort(){

        int arr[] = {1, 2, 45, 4, 5, 6, 47, 32};
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = i + 1; j < arr.length; j++) {
                    int temp = 0;

                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                System.out.print(arr[i] + " ");

            }

        }
        System.out.println(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
    }

    static void secondlargest(){

        int arr[] = {1, 2, 45, 4, 5, 6, 47, 32};
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = i + 1; j < arr.length; j++) {
                    int temp = 0;

                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                //System.out.print(arr[i] + " ");

            }

        }
        System.out.println(" ");
        //System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
    }

    static void numfrequency(){

        int arr[] = {1, 2, 45, 4, 5, 6, 47, 32,4,6,7,2,3,9,2,84,3,6,5,4,8,8,9,32,1,4,7,9,5,2,5,4,8,5,5,5,6,5,6,58,1,2,3,64,7,9,2};
        int [] arr2 = new int[arr.length];
        int counted = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    arr2[j]=counted;
                }
            }
            if(arr2[i]!=counted)
            arr2[i] = count;
        }
        for(int i = 0; i < arr2.length; i++) {
           if(arr2[i] != counted)
                System.out.println("    " + arr[i]  + "     |    " + arr2[i]);
        }
    }
    static void secondlargest1(){
        int[] arr={1,5,15,79,31,19,36,72,4,84,15,17,15,19,57,25};
        int large=0;
        int secondlarge=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>large){
                secondlarge=large;
                large=arr[i];
            }
            else if((arr[i]>secondlarge) && (arr[i]!=large)){
                secondlarge=arr[i];
            }
        }
        System.out.println("second largest : "  +secondlarge);
    }

            public static void main(String[] args) {
        printelement();
        minnum();
        maxnum();
        sumarray();
        evenposition();
        reversearray();
        oddposition();
        duplicate();
        arraysort();
        numfrequency();
        secondlargest();
        secondlargest1();
    }
}
