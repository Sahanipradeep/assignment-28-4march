package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int den;
        System.out.println("Enter the numerator:");
        num = sc.nextInt();
        System.out.println("Enter the denumerator:");
        den = sc.nextInt();
        int n, d, HCF, t;
        if (num > den) {
            n = num;
            d = den;
        } else {
            n = den;
            d = num;
        }
        while (d != 0) {
            t = d;
            d = n % d;
            n = t;
        }
        HCF = n;
        System.out.println("fraction in the lowest form:" + num / HCF + "/" + den / HCF);
    }
}