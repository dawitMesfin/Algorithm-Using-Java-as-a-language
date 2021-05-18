package com.MarashiTestExersice;

public class Main {

    //Question2.The sum of each digit in a given number?
     public static int sumOFDigits(int n){

         int sum = 0;
         int currentDigit = 0;

         while(n != 0) {
             currentDigit = n % 10;
             sum = sum + currentDigit;
             n = n/10;
         }
         return sum;

     }



       public static void main(String[] args) {

           int result = sumOFDigits(127);
           System.out.println(result);


    }}

