package com.bridgelabz.methods;

public class DayThreeProblemArray {
    static void printelement(){
        int[] arr={1,5,15,79,31,19,36,72,4,84,15,17,15,19,57,25};
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
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
        System.out.println(large);
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
        System.out.println(small);
    }


    static void evenposition() {

        System.out.println("******************************************************************************************");

        int[] arr = {100, 5, 15, 79, 31, 19, 36, 72, 4, 84, 15, 17, 15, 19, 57, 25};
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.print(arr[i] + " ");

            }

        }
        System.out.println(" ");
    }
    static void reversearray(){
        int[] arr = {100, 5, 15, 79, 31, 19, 36, 72, 4, 84, 15, 17, 15, 19, 57, 25};
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
    }



    public static void main(String[] args) {
        printelement();
        minnum();
        maxnum();
        evenposition();
        reversearray();
        oddposition();
        duplicate();
        arraysort();
    }
}
