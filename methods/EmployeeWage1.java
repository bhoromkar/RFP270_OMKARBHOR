package com.bridgelabz.methods;

public class EmployeeWage1 {
    static final int FULL_DAY_HOUR = 12;
    static final int PART_DAY_HOUR = 6;
    static final int WAGE_PER_HOUR = 20;
    static final int TOTAL_WORKING_DAYS = 20;
    static final int TOTAL_WORKING_HOUR = 100;


    public static void main(String[] args) {

        //int isPresent;
        //        double x1 = Math.random();
//        System.out.println(x1);
//        double x2 = x1 * 10;
//        System.out.println(x2);
//        double x3 = x2 % 2;
//        System.out.println(x3);
//        int x4 = (int)x3;
//        System.out.println(x4);
        final int count =10;
        int dayWage = 0;
        int day = 1;
        int workingHour=0;
        int totalWage=0;

        while (day <= TOTAL_WORKING_DAYS && workingHour < TOTAL_WORKING_HOUR) {
            int isPresent = (int) (Math.random() * 10 % 3);
            switch (isPresent) {
                case 1:
                    dayWage = PART_DAY_HOUR * WAGE_PER_HOUR;
                    System.out.println("part time");
                    workingHour=workingHour+PART_DAY_HOUR;
                    break;
                case 2:
                    dayWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
                    System.out.println("full time");
                    workingHour+=FULL_DAY_HOUR;
                    break;
                default:
                    System.out.println("absent");

            }
            totalWage=totalWage+dayWage;
            System.out.println(workingHour + " working hour");
            System.out.println(dayWage);
            System.out.println(day);
            day++;


        }
        System.out.println(totalWage);
    }
}
