package com.bridgelabz.methods;
import java.math.*;
import java.util.Scanner;

public class OperatorProblem {
    static void operator1(int a,int b,int c){
        int x =  a+b*c;
        int y = c+a/b;
        int z =  a%b+c;
        int w = a*b+c;
        System.out.println("X= " +x);
        System.out.println("Y= " +y);
        System.out.println("Z= " +z);
        System.out.println("W= " +w);

        if(x>y && x>w && x>z){
            System.out.println(x + " is largest");
        } else if (y>x && y>w && y>z) {
            System.out.println(y + " is largest");
        } else if (z>y && z>w && z>x) {
            System.out.println(z + " is largest");
        } else if (w>y && w>x && w>z) {
            System.out.println(w + " is largest");
        }

        if(x<y && x<w && x<z){
            System.out.println(x + " is smallest");
        } else if (y<x && y<w && y<z) {
            System.out.println(y + " is smallest");
        } else if (z<y && z<w && z<x) {
            System.out.println(z + " is smallest");
        } else if (w<y && w<x && w<z) {
            System.out.println(w + " is smallest");
        }
    }

    static void operator2( int a, int b , int c){
       int delta = b*b - 4*a*c;
       double d=Math.sqrt(delta);
       double x =(((-b)-(d))/(2*a));
       double root= a*x*x + b*x + c;
       int root1 = (int) root;
        //System.out.println(root);
        System.out.println(root1);

    }
//    static void operator3(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value of :: ");
//        int x1 = sc.nextInt();
//        System.out.println("Enter value of :: ");
//        int y1 = sc.nextInt();
//        System.out.println("Enter value of :: ");
//        int x2 = sc.nextInt();
//        System.out.println("Enter value of :: ");
//        int y2 = sc.nextInt();
//        double x =(x2-x1);
//        double y =(y2-y1);
//        double d=((x*x)+(y*y));
//        double distance =Math.sqrt(d);
//        //int distance1=(int) distance;
//        System.out.println(distance);

    //}
    static void operator4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month:: ");
        int month = sc.nextInt();
        System.out.println("Enter the date :: ");
        int date = sc.nextInt();
        if (((date >= 20 && month == 3) || (month == 6 && date <= 20) || (month == 4 && date >= 1) ||(month == 5 && date <= 1) && (date<=31))) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }

    public static void main(String[] args) {
       operator1(10,20,30);
       operator2(7,554,50);
       //operator3();
        operator4();
    }
}
