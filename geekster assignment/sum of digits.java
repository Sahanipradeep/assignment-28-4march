package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num,sum=0,digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        while(num>0) {
            digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println("sum of digits:"+sum);
    }
}