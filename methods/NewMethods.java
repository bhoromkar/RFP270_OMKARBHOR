package com.bridgelabz.methods;

public class NewMethods {
    static void method1(){
        int x = 10;
        int y = 30;
        int sum = x+y;
        System.out.println(sum);
    }

    static void method2(int x ,int y){
      int prod = x*y;
        System.out.println(prod);
    }
    static int method3(int x1,int y1){
        int sub = x1-y1;
        return sub;
    }

    public static void main(String[] args) {

        int sub1= method3(30 ,20);
        System.out.println(sub1);
        method1();
        method2(5 ,6);


    }
}
