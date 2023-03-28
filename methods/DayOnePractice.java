package com.bridgelabz.methods;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class DayOnePractice {

    static void helloworld() {
        System.out.println("Hello World");
    }

    static boolean val1;
    static double a;
    static float b;

    static short c;
    static byte d;

    static int e;
    static long f;
    static char g;

static void checkstring(){
    String a1 = "omkarbhor";
    String b1 = "omkarbhor";
    if (a1==b1) {
        System.out.println("Both the string are same");
    }
    else {
        System.out.println("Both the string are not same");
    }
}

static void leapyear(int year) {
    //int year = 1999
    if (year > 1583) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is leap year");
        } else {
            System.out.println("The year is not leap year");
        }
    } else {
        System.out.println("year is less than 1582");
    }
}

static void singledigit(int digit){
    if(digit==1){
        System.out.println("one");
    }
    else if (digit==2) {
        System.out.println("two");
    }
    else if (digit==3) {
        System.out.println("three");
    }
    else if (digit==4) {
        System.out.println("four");
    }
    else if (digit==5) {
        System.out.println("five");
    }
    else if (digit==6) {
        System.out.println("six");
    }
    else if (digit==7) {
        System.out.println("seven");
    }
    else if (digit==8) {
        System.out.println("eight");
    }
    else if (digit==9) {
        System.out.println("nine");
    }
    else {
        System.out.println("none");
    }

}

static void unitdigit(int num){
    if(num==1){
        System.out.println("unit");
    }
    else if (num==10) {
        System.out.println("ten");
    }
    else if (num==100) {
        System.out.println("hundred");
    }
    else if (num==1000) {
        System.out.println("thousand");
    }
    else{
        System.out.println("none");
    }

    }

    static void alphabet(char ch){

        switch(ch){

            case 'A':
                System.out.println("vowel");
                break;
            case 'B':
                System.out.println("consonant");
                break;
            case 'C':
                System.out.println("consonant");
                break;
            case 'D':
                System.out.println("consonant");
                break;
            case 'E':
                System.out.println("VOWEL");
                break;
                case 'F':
                System.out.println("consonant");
                break;
                case 'G':
                System.out.println("consonant");
                break;
                case 'H':
                System.out.println("consonant");
                break;
                case 'I':
                System.out.println("VOWEL");
                break;
                case 'J':
                System.out.println("consonant");
                break;
                case 'K':
                System.out.println("consonant");
                break;
                case 'L':
                System.out.println("consonant");
                break;
                case 'M':
                System.out.println("consonant");
                break;
                case 'N':
                System.out.println("consonant");
                break;
                case 'O':
                System.out.println("VOWEL");
                break;
                case 'P':
                System.out.println("consonant");
                break;
                case 'Q':
                System.out.println("consonant");
                break;
                case 'R':
                System.out.println("consonant");
                break;
                case 'S':
                System.out.println("consonant");
                break;
                case 'T':
                System.out.println("consonant");
                break;
                case 'U':
                System.out.println("VOWEL");
                break;
                case 'V':
                System.out.println("consonant");
                break;
                case 'X':
                System.out.println("consonant");
                break;
                case 'Y':
                System.out.println("consonant");
                break;
                case 'Z':
                System.out.println("consonant");
                break;
            default:
                System.out.println("NONE");
        }


    }
static void month(int month) {
    switch (month) {

        case 1:
            System.out.println("january");
            break;
        case 2:
            System.out.println("february");
            break;
        case 3:
            System.out.println("march");
            break;
        case 4:
            System.out.println("april");
            break;
        case 5:
            System.out.println("may");
            break;
        case 6:
            System.out.println("june");
            break;
        case 7:
            System.out.println("july");
            break;
        case 8:
            System.out.println("august");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("October");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        default:
            System.out.println("none");
    }
}
static void getsum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an x :: ");
  int x = sc.nextInt();
    System.out.println("Enter an y :: ");
  int y = sc.nextInt();

    int sum = x+y;
    System.out.println(sum);
}

     static void getchar() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an name :: ");
    String str = sc.nextLine();
    System.out.println(str);
}


    public static void main(String[] args) {
         helloworld();
        System.out.println("Default value of boolean is:" +val1);
        System.out.println("Default value of Double is:" +a);
        System.out.println("Default value of float is:" +b);
        System.out.println("Default value of short is:" +c);
        System.out.println("Default value of byte is:" +d);
        System.out.println("Default value of int is:" +e);
        System.out.println("Default value of long is:" +f);
        System.out.println("Default value of character is:" +g);
        checkstring();
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        System.out.println("Enter an Year :: ");
        leapyear(1482);
        singledigit(9);
        unitdigit(1000);
        alphabet('Z');
        month(12);
        getsum();
        getchar();
    }
}
