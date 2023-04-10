package com.bridgelabz.methods;

public class PrimeNum {

    static void primenum() {

        int i;
        int j;
        int arr[] = {2, 45, 4, 5, 6, 47, 32, 17, 19, 23};

        for (i = 0; i < arr.length; i++) {
            boolean isPrime = true;
                for (j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;

                    }
                }

                if (isPrime) {
                        System.out.print(arr[i] + " " );
                    }

                }
        System.out.println("are the number in an array");
        }


    public static void main(String[] args) {
        primenum();
    }

}
