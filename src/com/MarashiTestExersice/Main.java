package com.MarashiTestExersice;

public class Main {

    //Question1.Is a number's all digit are even?


       public static int isEven(int n){

           int areEven = 1;
           while (n != 0){
               int currentDigit = n % 10;
               if(currentDigit % 2 != 0){
                   areEven = 0;
                   break;
               }
               n = n / 10;
           }

           return areEven;
       }


       public static void main(String[] args) {

           int result = isEven(276);
           System.out.println((result));


    }}

