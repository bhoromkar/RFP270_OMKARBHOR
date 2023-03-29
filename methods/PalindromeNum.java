package com.bridgelabz.methods;
import java.util.Scanner;

public class PalindromeNum {

    static void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number for palindrome:: ");
        int num = sc.nextInt();
        int number= num;
        //int sum=0;
        int reverse=0;
        while (num>0){
            int remainder = num % 10;
            reverse = (reverse * 10 )+remainder;
            num=num/10;
        }
        if (reverse==number){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("the number is not palindrome");
        }
    }
    public static void main(String[] args) {
                palindrome();
    }
}
