package com.bridgelabz.methods;

import java.util.Scanner;

public class LineCompare {

        static void linecomrare(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of line1x1:: ");
            int line1x1 = sc.nextInt();
            System.out.println("Enter value of line1y1:: ");
            int line1y1 = sc.nextInt();
            System.out.println("Enter value of line1x2:: ");
            int line1x2 = sc.nextInt();
            System.out.println("Enter value of line1y2:: ");
            int line1y2 = sc.nextInt();
            System.out.println("Enter value of line2x1:: ");
            int line2x1 = sc.nextInt();
            System.out.println("Enter value of line2y1:: ");
            int line2y1 = sc.nextInt();
            System.out.println("Enter value of line2x2:: ");
            int line2x2 = sc.nextInt();
            System.out.println("Enter value of line2y2:: ");
            int line2y2 = sc.nextInt();
            double x =(line1x2-line1x1);
            double y =(line1y2-line1y1);
            double d1=((x*x)+(y*y));
            double p =(line2x2-line2x1);
            double q =(line2y2-line2y1);
            double d2=((p*p)+(q*q));
            double distance =Math.sqrt(d1);
            double distance1=Math.sqrt(d2);
            //int distance1=(int) distance;
            System.out.println("the length of line 1 is : " +distance);
            System.out.println("the length of line 2 is : " +distance1);
            if(distance>distance1){
                System.out.println("line 1 is greater :" +distance);
            } else if (distance<distance1) {
                System.out.println("line 2 is greater" +distance1);
            }else{
                System.out.println("line are equals");
            }

        }
        public static void main(String[] args) {
            linecomrare();
        }
    }

