package com.bridgelabz.methods;

public class Pattern {

  public static void pyramid(int n) {
      for (int i = 0; i < n; i++) {
          for (int j = n-i; j >1 ; j--) {
              System.out.print(" ");
          }
              for (int k= 0; k<=i; k++) {
                  System.out.print("* ");
              }
              System.out.println();
          }
      }
    public static void pyramid1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >1 ; j--) {
                System.out.print("  ");
            }
            for (int k= 0; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void righttriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<=i ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
pyramid(6);
pyramid1(7);
righttriangle(5);
    }
}
