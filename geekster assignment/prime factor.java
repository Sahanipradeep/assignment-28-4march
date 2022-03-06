package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        System.out.println("Prime factors of "+num+"are:" );
        for(int i=2;i<=num;i++) {
            if(num%i==0) {
                int p=0;
                for(int j=2;j<i;j++) {
                    if(i%j==0) {
                        p++;
                        break;
                    }
                }
                if(p==0) {
                    System.out.println(i);
                }
            }
        }
    }
}
