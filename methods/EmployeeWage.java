package com.bridgelabz.methods;

public class EmployeeWage {
    static void employeewage() {
        int days =1;
        int count,count1,count2;
        {   count2=1;
            count = 1;
            count1=1;
            //while(days==30)
            while (days<31){
                double isPresent = (int) (Math.random() * 10 % 3);
                int present = (int) isPresent;
                   days++;
                if (present == 2) {
                    count++;

                    System.out.println("employee is present on day for full time work " + count);
                } else if (present==1) {
                    count1++;
                    System.out.println("employee is present on day for part time work " + count);
                } else{
                    count2++;
                    System.out.println("employee is absent");
                }


            }

        }   int wagepart= 4 * 20 * count1;                           //4 hours when employee work part time
            int wagefull = 8 * 20 * count;                          //8 hours when employee work full time
            int totalwage =wagepart+wagefull;
            int fulltimehour = count*8;
            int parttimehour = count1*4;
            System.out.println(fulltimehour+ " hours for employee work as full time in a month.");
            System.out.println(parttimehour + " hours for employee work as Part time in a month.");
            int totalhour= fulltimehour+parttimehour;
            int totalwage1=20*totalhour;
        System.out.println(count1 + " days employee work as part time in a month.");
        System.out.println(count + " days employee work as full time in a month.");
        System.out.println(count2 + " days employee work absent in a month.");
        System.out.println(totalhour + " hours employee work in a month");
        System.out.println(totalwage + " total wage using no of days employee work.");
        System.out.println(totalwage1 + " total wage using hours employee work.");

        }

    public static void main(String[] args) {
      employeewage();
    }
}
