package com.bridgelabz.methods;

public class Factorial {
    static void factorial(int num){
        int fact=1;
       for(int i=1;i<=num;i++)
       {
           fact=fact*i;
        }
        System.out.println(fact);
    }

    static void factorial1(int num) {
        int fact = 1;{
        int i = 1;{
        while (i<= num) {
            fact = fact * i;
            i++;
        }
    }
        System.out.println(fact);
    }
    }
    static void digit(int num) {
        switch (num) {

            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("none");
        }
    }
    public static void main(String[] args) {
        factorial(5);
        factorial1(5);
        digit(6);

    }
}
