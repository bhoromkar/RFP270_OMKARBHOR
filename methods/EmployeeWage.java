package com.bridgelabz.methods;

public class EmployeeWage {
    static void employeewage() {
        int days =1;
        int count;
        {
            count = 1;

            //while(days==30)
            while (count<20){
                double isPresent = (int) (Math.random() * 10 % 2);
                int present = (int) isPresent;
                   //days++;
                if (present == 1) {
                    count++;

                    System.out.println("employee is present on day " + count);
                } else {
                    System.out.println("employee is absent");
                }


            }

        }
            int wage = 8 * 20 * count;
            System.out.println(count);
            System.out.println(wage);
        }

    public static void main(String[] args) {
      employeewage();
    }
}
