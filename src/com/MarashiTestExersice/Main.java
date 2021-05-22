package com.MarashiTestExersice;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.sql.SQLOutput;

public class Main {

    //Question1.The sum of each digit in a given number?
    public static int sumOFDigits(int n) {

        int sum = 0;
        int currentDigit = 0;

        while (n != 0) {
            currentDigit = n % 10;
            sum = sum + currentDigit;
            n = n / 10;
        }
        return sum;

    }


    // Question2 Is a given number prime?

    public static int isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return 1;
        }
        return 0;
    }

    //Question3 Number of prime numbers in a given range m and n

    public static int numberOfPrimes(int m, int n) {
        int count = 0;
        for (int i = m + 1; i < n; i++) {
            boolean flaging = true;

            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flaging = false;
                    break;
                }
            }
            if (flaging) {
                count = count + 1;
            }
        }
        return count;
    }

    // Question4 Is the given array Magic Array?

    public static int isMagic(int[] givenArray) {
        int firstElement = givenArray[0];
        int primSum = 0;
        for (int i = 0; i < givenArray.length; i++) {

            boolean isPrime = true;
            for (int j = 2; j < givenArray[i]; j++) {

                if (givenArray[i] % j == 0) {

                    isPrime = false;
                    break;
                }
            }
            if (isPrime && givenArray[i] >= 0) {
                primSum = primSum + givenArray[i];
            }


        }
        if (primSum == firstElement) {
            return 1;

        }
        return 0;
    }

    // Question5 isComplete?

    public static int isComplete(int[] givenArray) {
        int max = givenArray[0];
        int min = givenArray[0];

        for (int i = 0; i < givenArray.length; i++) {

            if (givenArray[i] > max && givenArray[i] % 2 == 0) {
                max = givenArray[i];
            }

            if (givenArray[i] <= min && givenArray[i]%2 == 0){

                min = givenArray[i];
            }
        }

        if (min % 2 != 0 || max % 2 != 0) {
            return 0;
        }

        boolean isBetweenMaxandMin = true;
        for (int j = min + 1 ; j < max; j ++){
            boolean found = false;
            for (int i = 0; i < givenArray.length; i ++){
                if (givenArray[i] == j) {
                    found = true;
                    break;
                }
            }

            if (!found){
                isBetweenMaxandMin = false;
                break;
            }
        }

        if (max!=min && isBetweenMaxandMin){
            return 1;
        }
        return 0;
    }

    //Question6 Are all numbers in the range element of the array?

     public static int areInTheArray(int [] givenArray){
        int max = givenArray[0];
        int min = givenArray[0];

        for(int i = 0; i < givenArray.length; i++){

             if (givenArray[i] >= max && givenArray[i]%2==0){
                 max = givenArray[i];
             }
             if (givenArray[i] < min && givenArray[i] % 2==0 ){
                 min = givenArray[i];

             }
         }
        if (min == max && (min % 2!=0 || max % 2 !=0 )   ){

              return 0;
         }
         System.out.println("max"+max);
         System.out.println("min"+min);

         boolean isBetween = true;
         for (int j = min + 1; j < max; j++){
              boolean isFound = false;
              for (int i = 0; i < givenArray.length; i++){
                 if (j == givenArray[i]){
                     isFound = true;
                     break;
                 }

             }
             if (!isFound){
                 isBetween = false;
             }
         }
         if (isBetween){
             return 1;
         }
         return 0;
     }

     //Question7 is a given number a prime product?

    public static int isPrimeProduct(int n) {

        for (int i = 2; i <= n / 2; i++) {
            boolean isPrime1 = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime1 = false;
                    break;
                }
            }

            if (isPrime1){

            for (int j = 2; j <= n/2; j++) {
                boolean isPrime2 = true;
                for (int k = 2; k < j; k++) {
                    if (j % k == 0) {
                        isPrime2 = false;
                        break;
                    }
                if (isPrime2 && i *j ==n){
                    return 1;
                }
                }}




            }
        }

        return  0;
    }
    //Using isItPrime method
    public static boolean isItPrime(int n){
        boolean flag = true;
        for (int i = 2; i <= n/2; i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int  isItPrimeProduct(int x){
        for (int i = 2; i <= x/2; i ++){
            if (isItPrime(i)){
                for(int j = 2; j <= x/2; j ++){
                    if (isItPrime(j) && i * j == x){
                        return 1;
                    }
                }

            }
        }
        return 0;
    }


        public static void main (String[]args){
            int result = isPrimeProduct(20);
            System.out.println(result);
        }
    }

