package com.bridgelabz.methods;

import java.util.Scanner;

public class LineC {
    public LineC lines1;
    public LineC lines2;
    static int line1x1, line1y1, line1x2, line1y2, line2x1, line2x2, line2y1, line2y2;
    static double x, y, d1, p, q, d2, distance;
    static double distance1;

    static double linecomrare1() {
         x = (line1x2 - line1x1);
         y = (line1y2 - line1y1);
         d1 = ((x * x) + (y * y));
         return d1;

    }
    static double linecomrare2() {
         p = (line2x2 - line2x1);
         q = (line2y2 - line2y1);
         d2 = ((p * p) + (q * q));
        return d2;
    }

    public static double lines1()
    {   d1= linecomrare1();
        distance = Math.sqrt(d1);
        return distance;
    }

    public static double lines2() {
        d2=linecomrare2();
        distance1 = Math.sqrt(d2);
        //System.out.println(distance1);
        return distance1;
    }



    public void main(String[] args) {
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
        //int distance1=(int) distance;
        System.out.println("the length of line 1 is : " +distance);
        System.out.println("the length of line 2 is : " +distance1);
//        if(distance>distance1){
//            System.out.println("line 1 is greater :" +distance);
//        } else if (distance<distance1) {
//            System.out.println("line 2 is greater" +distance1);
//        }else{
//            System.out.println("line are equals");
//        }
        LineC l1= new LineC();
      //  System.out.println(distance.equals(distance1));
        double a= (l1.lines1.distance);
       //LineC l2= new LineC();
       double b = (l1.lines2.distance1);

        System.out.println(b + "b");
        System.out.println(a + " a");
        // LineCompare l1= new LineCompare();


    }
}




