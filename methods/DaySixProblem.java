package com.bridgelabz.methods;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class DaySixProblem {

    static void fibonacci(int num){
       int number1=0;
       int number2=1;

       for(int i=0;i<=num;i++){
           System.out.print(number1 + "  " );
           int number3 = number1 + number2;
           number1 = number2;
           number2 = number3;
       }
        System.out.println();
    }
    static void perfectNum(int num){
        int sum=0;
    for(int i=1;i<=num;i++)  {
        if(num%i==0){
            System.out.print(i + " ");
        }
        sum=sum+i;
     if(num==sum)   {
         System.out.print(" the number is perfect num");
         break;
     }
    }
        System.out.println("number is not perfect number");
    }

    static void revNum(int num){
        int remainder;
        int revNumber=0;
        while(num > 1) {
            remainder = num % 10;
            revNumber = ((revNumber * 10) + remainder);
            num = num / 10;
        }
        System.out.println(revNumber);

        }

        static void stopWatch(){
        long start,end;
        Scanner sc = new Scanner(System.in);
            System.out.println("start the stopwatch by entering any num ");
            char s =sc.next().charAt(0);
            start = System.currentTimeMillis();
            System.out.println("stop the stopwatch by entering any num ");
            char f =sc.next().charAt(0);
            end = System.currentTimeMillis();


       double time= end- start;
       float totalTime=(float) (time/1000);
       System.out.println(totalTime + " seconds");

        }
        static void coupon(int num) {
           int l=0;
            int [] arr1= new int[num];
            int [] arr2= new int[num];
                for(int i = 0;i <num;i++) {
                //double couponNumber =(Math.random() * 10 + 100); //100 to 199 number
                double coupon = (int) (Math.random() * 10 + 1000 );
                int couponNumber= (int) coupon;
               // System.out.println(couponNumber);
                  arr1[i] =couponNumber;
                    //System.out.print(arr1[i]+  "  ");
                }
            System.out.println(Arrays.toString(arr1) + " are all generated coupon number");
                for(int j=0 ;j<arr1.length;j++) {
                    boolean coupons = false;
                    for (int k = j + 1; k < arr1.length; k++) {
                        if (arr1[j] == arr1[k]) {
                            coupons = true;
                            break;
                        }
                    }
                    if (coupons == false) { //for number are not distinct

                        if (l < arr2.length)
                            arr2[l] = arr1[j];
                        l++;
                        System.out.print(arr1[j] + " ");
                       // System.out.print(arr2[l] + " ");
                    }
                }
            System.out.println(" this are unique coupon number");
           // System.out.println(Arrays.toString(arr2) + " this are coupon number");
    }



    public static void main(String[] args) {
fibonacci(10);
perfectNum(425);
revNum(5142);
//stopWatch();
        coupon(20);

    }
}
