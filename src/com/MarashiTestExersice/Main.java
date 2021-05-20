package com.MarashiTestExersice;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.sql.SQLOutput;

public class Main {

    //Question1.The sum of each digit in a given number?
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


     // Question2 Is a given number prime?

      public  static int isPrime(int n){
         boolean flag = true;
         for(int i = 2; i <= n/2; i++){
             if(n % i == 0){
                 flag = false;
                 break;
             }
         }
         if (flag){
             return 1;
         }
         return 0;
      }

     //Question3 Number of prime numbers in a given range m and n

    public  static int numberOfPrimes(int m , int n){
         int count = 0;
         for(int i = m + 1; i < n; i++){
             boolean flaging = true;

             for (int j = 2; j < i/2; j ++){
                   if (i%j==0){
                       flaging = false;
                       break;
                   }
               }
               if (flaging){
                   count = count +1;
               }
           }
         return count;
    }

    // Question4 Is the given array Magic Array?

    public static int isMagic(int [] givenArray){
         int firstElement = givenArray[0];
         int primSum = 0;
         for (int i = 0; i < givenArray.length; i++){

               boolean isPrime = true;
               for (int j = 2; j < givenArray[i]; j++){

                     if(givenArray[i] % j == 0){

                         isPrime = false;
                         break;
                     }
               }
               if (isPrime && givenArray[i] >= 0) {
                   primSum = primSum + givenArray[i];
               }


         }
         if (primSum == firstElement){
             return 1;

         }
         return 0;
    }



      public static void main(String[] args) {
         int [] array = {26,13,2,5,3,3};
      int result = isMagic(array);
          System.out.println(result);
    }}

