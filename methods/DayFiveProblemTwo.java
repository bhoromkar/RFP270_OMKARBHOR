package com.bridgelabz.methods;

import java.util.Scanner;

public class DayFiveProblemTwo {
//    static int remainder=0;
//    static double quotient=0;
    static void primeFactor(int n){
        int d=2;
        while(n>1){
            if(n%d==0){
                System.out.print(d + " ");
                n=n/d;
            }else
            d++;
        }
        System.out.println(" are the prime factors");
    }
    static void harmonic(int num){
        int harmonic=0;
        for(int i = 1; i<=num;i++){
            harmonic = harmonic+(1/i);
        }
        System.out.println(" addition of harmonic num is : " +harmonic);

    }

    static void quotientAndRemainder(int num ,int divisor) {
        int remainder = num % divisor;
        int quotient = num / divisor;
        System.out.println("remainder is: "+remainder);
        System.out.println("quotient is: " +quotient);
        }

        static void power(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an number for base:: ");
            int base = sc.nextInt();
            System.out.println("Enter an number for exponetial:: ");
            int exp = sc.nextInt();
        int power = 1;
        for(int i=exp;i>=power;i--){
            power = power*base;
            System.out.println("the power is " + power);
        }
        }
static void largestThree(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            System.out.println("largest number is: "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("largest number is: " + num2);
        }else
            System.out.println("largest number is: "+num3);

}
static void evenOrOdd(int num){
        if(num%2==0){
            System.out.println("num is even");
        }else
            System.out.println("num is odd");
}
static void swapNum(int num1, int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
    System.out.println("num2 is now "+num1);
    System.out.println("num1 is now "+num2);
}


    public static void main(String[] args) {
    primeFactor(145);
    harmonic(5);
    quotientAndRemainder(100,11);
    //power();
        largestThree(10,57,2);
        evenOrOdd(57);
        swapNum(15,35);
        

    }
}
