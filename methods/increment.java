package com.bridgelabz.methods;

public class increment {

    public static void main(String[] args) {
        int y=43;
        int res =y-- - y++ + y-- - --y+--y - ++y + y++ - y++ + y--;
        System.out.println(y);
        System.out.println(res);

    }
}
