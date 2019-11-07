package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public  static void main(String[] args){
        float y;

        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("請輸入西元年:");
            y = scanner.nextFloat();
            if (y % 4 == 0 && y==(int) y ) {
                System.out.println("此年為閏年\n");

            }
            else if (y !=(int) y){
                System.out.println("請輸入整數\n");
            }
            else {
                System.out.println("此年非閏年\n");
            }
        }

    }
}
