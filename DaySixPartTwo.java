package com.bridgelabz.methods.RFP270_OMKARBHOR;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DaySixPartTwo {
    static int t;
    static float T;
    static float epsilon;
    static int amount;

    static void monthlyPayment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal loan amount");
        int P = sc.nextInt();
        System.out.println("enter the Rate of interest");
        int R = sc.nextInt();
        System.out.println("enter the Years");
        int Y = sc.nextInt();
        double n = 12 * Y;
        double r = ((R * 100) / 12);
        double q = (1 + r);
        //double N=-n;
        double m = Math.pow(q, -n);
        double payment = ((P * r) / (1 - m));
        System.out.println(payment);
    }

    static void temperatureConversion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius ");
        float C = sc.nextInt();
        float F = ((C * 9 / 5) + 32);
        System.out.println("The temperature in Fahrenheit: " + F);
        System.out.println("Enter the temperature in Fahrenheit: ");
        float f = sc.nextInt();
        float c = ((f - 32) * 5 / 9);
        System.out.println("The temperature in Celsius " + c);
    }

    static void dayOfWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day ");
        int d = sc.nextInt();
        System.out.println("Enter the Month ");
        int m = sc.nextInt();
        System.out.println("Enter the Year ");
        int y = sc.nextInt();
        int y0 = (y - (14 - m) / 12);
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        System.out.println(d0);
        switch (d0) {

            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong option");


        }
    }

    static void sqrt(int c) {
        t = c;
        T = (float) (Math.abs(t - c / t));
        epsilon = (float) ((1 * 2.718281828459045 - 15) * t);
        while (T > epsilon) {
            t = (((c / t) + (t)) / 2);
            T = Math.abs(t - c / t);
            epsilon = (float) ((1 * 2.718281828459045 - 15) * t);
            break;
        }
        System.out.println(T);
    }

    static void vendingMachine() {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount ");
        int amount = sc.nextInt();
        while (amount > 0) {
            if (amount % 1000 == 0) {
                count++;
                System.out.println("1000");
                amount = amount - 1000;

            } else if (amount % 500 == 0) {
                count1++;
                System.out.println("500");
                amount = amount - 500;
            } else if (amount % 100 == 0) {
                count2++;
                System.out.println("100");
                amount = amount - 100;
            } else if (amount % 50 == 0) {
                count3++;
                System.out.println("50");
                amount = amount - 50;
            } else if (amount % 10 == 0) {
                count4++;
                System.out.println("10");
                amount = amount - 10;
            } else if (amount % 5 == 0) {
                count5++;
                System.out.println("5");
                amount = amount - 5;
            } else if (amount % 2 == 0) {
                count6++;
                System.out.println("1");
                amount = amount - 2;

            } else if (amount % 1 == 0) {
                count7++;
                System.out.println("1");
                amount = amount - 1;

            }
        }


        System.out.println(count + " note of 1000 Rs");
        System.out.println(count1 + " note of 500 Rs");
        System.out.println(count2 + " note of 100 Rs");
        System.out.println(count3 + " note of 50 Rs");
        System.out.println(count4 + " note of 10 Rs");
        System.out.println(count5 + " note of 5 Rs");
        System.out.println(count6 + " note of 2 Rs");
        System.out.println(count7 + " note of 1 Rs");
        int totalNotes = count + count1 + count2 + count3 + count4 + count5 + count6 + count7;
        System.out.println("total number of notes are " + totalNotes);

    }

 static void countCurrency(int amount) {
        int[] notes = new int[]{1000, 500, 100, 50, 20, 10, 5,2,1};
        int[] noteCounter = new int[9];

        // count notes using Greedy approach
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }



    static void decimalToBinary(int N) {

        // To store the binary number
        int B_Number = 0;
        int i = 0;
        while (N != 0) {
            int rem = N % 2;
            double c = Math.pow(10, i);
            B_Number += rem * c;
            N /= 2;

            // Count used to store exponent value
           i++;
        }

        System.out.println(B_Number);
    }
    static  void convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }

        System.out.println(decimalNumber);
    }



//driver function
    public static void main(String[] args) {
//monthlyPayment();
//temperatureConversion();
//dayOfWeek();
//sqrt(16);
       // vendingMachine();
        //countCurrency(7463);
        decimalToBinary(17);
        convertBinaryToDecimal(101010);
    }
}
