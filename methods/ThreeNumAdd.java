package com.bridgelabz.methods;
import java.util.Arrays;

public class ThreeNumAdd {
    static void sum(int x, int y, int z) {  // with parameter and without return
        int sum = x + y + z;
        System.out.println(sum);
    }

    static int sum1(int x1, int y1, int z1) {  //with parameter and with return
        int sum2 = x1 + y1 + z1;
        return sum2;
    }

    static int add() { //without parameter and with return type
        int a = 11;
        int b = 22;
        int c = 33;
        int sum3 = a + b + c;
        return sum3;

    }

    static void withoutparameterandreturn() {  // without parameter without return type
        int num1 = 45;
        int num2 = 50;
        int num3 = 60;
        int add1 = num1 + num2 + num3;
        System.out.println(add1);
    }

    static int[] evennum() {

        //int sum = 0;
        int arr[] = {1, 2, 45, 4, 5, 6, 47, 32};
        int arr1[] = new int[arr.length];
        for (int i = 0,j=0; i < arr.length; i++,j++) {
                int value = arr[i];
                int res = value % 2;
                if (res == 0) {
                    arr1[j] = arr[i];
                    //int arr1[] = new int[arr1.length];
                }
//                for (int j = 0; j < arr.length; j++) {
//                    arr1[j] = arr[i];
//                    //sum= sum+arr[i];
          }
        //System.out.println(Arrays.toString(arr1));
        return arr1;
    }



               static void sumarrray () {
                   int arr1[] = evennum();
                   int arrsum = 0;
                   for (int k = 0; k < arr1.length; k++) {
                       arrsum = arrsum + arr1[k];

                   }
                   System.out.println(arrsum);
               }

    public static void main(String[] args){

        sum(10,20,30);
        int addition = sum1(45,36,78);
        System.out.println(addition);
        int addwithoutpara = add();
        System.out.println(addwithoutpara);
        withoutparameterandreturn();
        int[] evenarray = evennum();
        System.out.println(Arrays.toString(evenarray));
        sumarrray();
    }

}
