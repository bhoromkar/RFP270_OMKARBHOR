package com.bridgelabz.methods;

public class DayFiveAssignment {
    static final double coin = 0.5;
    static double percentageForTail;
    static double percentageForHead;
   static double countForTail = 0;
    static double countForHead = 0;
    static double toss = 0;

    static double flipPercentage() {
        double getValue = (Math.random() * 10 % 1);
        Double value = (double) (Math.round(getValue * 10.0) / 10.0);
        System.out.println(value);
        return value;
    }

    public static void main(String[] args) {

        while (toss < 10) {
            double flip = flipPercentage();
            if (flip < coin) {
                countForTail++;
                System.out.println("tails");
            } else {
                countForHead++;
                System.out.println("head");
            }
            toss++;
        }
        System.out.println(countForHead);
        System.out.println(countForTail);
        System.out.println(toss);
        percentageForTail =((countForTail / toss) * 100);
        percentageForHead = ((countForHead/toss) * 100);
        System.out.println(percentageForTail);
        System.out.println(percentageForHead);
        }

    }



