package com.MarashiTestExersice;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

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

    //Question 8 Is a given array balanced?

    public  static int isBalanced(int [] givenArray){

        boolean flag = true;

        for(int i = 0; i < givenArray.length; i ++){
            boolean isIndexEven = i % 2 == 0;
            boolean isNumberEven = givenArray[i] % 2 == 0;

            if (isIndexEven && !isNumberEven) {
                flag = false;
                break;
            }

            if (!isIndexEven && isNumberEven) {
                flag = false;
                break;
            }
        }

        if (flag) {
            return 1;
        }
        return 0;
    }

    //Question 9 is a given array odd centered?
      public static int isCentered(int [] arr){

         int length = arr.length;
          if (length % 2==0 || length < 1) {
              return 0;
          }
         int middleIndex = (length - 1)/2;
         int middleElement = arr[middleIndex];
         for (int i = 0; i < length; i ++){
             if (i != middleIndex && arr[i] <= middleElement) {
                 return 0;
             }
          }

         return 1;
      }

    //Question 10 has it k small factor?

    public static boolean hasKsmallFactor(int k, int n){
        for (int u = 1; u < k; u++){
            for (int v = 1; v < k; v++){
                if (u*v == n){
                    return true;
                }
            }
        }
        return false;
    }

    //Question 11 return arr2 based on the given parameter

    public static int [] fill(int [] arr,int k, int n){

         if(arr.length < k || k < 0 || n < 0){
             return null;
         }
         int [] arr2 = new int[n];
         for (int i = 0; i < k; i++){
             arr2[i] = arr[i];
         }
         for (int j = k; j < n; j ++) {
             arr2[j] = arr2[j - k];
         }

         return arr2;
    }



        public static void main(String [] args){
          int [] arr1 = {1,8,3};
          int [] result = fill(arr1,4,7);
            System.out.println(Arrays.toString(result));


        }
    }

