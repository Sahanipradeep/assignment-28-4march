
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] arg){

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        sumofDigits(n);
    }
    public static void sumofDigits(int n){
        int sumOfOddDigits=0;
        int sumOfEvenDigits=0;
        while(n!=0){
            int temp=n;
            temp=temp%10;
            if(temp%2!=0){
                sumOfOddDigits=sumOfOddDigits+temp;
            }else{
                sumOfEvenDigits=sumOfEvenDigits+temp;
            }
            n=n/10;
        }
        System.out.println("Sum of odd digits:"+sumOfOddDigits);
        System.out.println("Sum of odd digits:"+sumOfEvenDigits);
    }
}