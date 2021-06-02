package com.MarashiTestExersice;

import com.sun.source.tree.BreakTree;

import javax.print.attribute.standard.PresentationDirection;
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


    // Q 12
    public static boolean isHollow2(int[] arr) {
        int leftCounter = 0;
        int rightCounter = 0;
        int zeroCounter = 0;

        int state = 0;
        int index = 0;

        while (index < arr.length) {
            switch (state) {
                // Initial State
                case 0: {
                    int value = arr[index];
                    if (value == 0) return false;
                    state = 1;
                    break;
                }
                // Left counter
                case 1: {
                    leftCounter++;
                    index++;
                    if (index >= arr.length) break;

                    if (arr[index] == 0) {
                        state = 2;
                    }
                    break;
                }

                // Zero counter
                case 2: {
                    zeroCounter++;
                    index++;
                    if (index >= arr.length) break;

                    if (arr[index] != 0) {
                        state = 3;
                    }
                    break;
                }

                // Right Counter
                case 3: {
                    if (zeroCounter < 3) return false;

                    rightCounter++;
                    index++;
                    if (index >= arr.length) break;

                    if (arr[index] == 0) {
                        return false;
                    }
                    break;
                }
            }
        }

        if (zeroCounter == leftCounter && zeroCounter == rightCounter) {
            return true;
        }
        return false;
    }

    //Question 12 Hollow Array

    public static int isHollow(int [] a){

         if (a[0] == 0 || a[a.length - 1] == 0){
             return 0;
         }
         int zeroCount = 0;
         int rightCount = 0;
         int leftCount = 0;
         for (int i = 0; i < a.length; i++ ){
             if(a[i] == 0){
                 leftCount = i;
                 break;
             }
         }

         int lastZeroIndex = 0;
         for (int j = leftCount; j < a.length; j++){
             if (a[j] != 0){
                 zeroCount = j - leftCount;
                 lastZeroIndex = j;
                 break;
             }
         }

         if (zeroCount < 3) return 0;
         if (zeroCount != leftCount) return 0;


         for (int k = lastZeroIndex; k < a.length; k++) {
             if (a[k] == 0) return 0;

             rightCount++;
         }


         if (leftCount == rightCount ){
             return 1;
         }
         return 0;
    }

    // Question 13 find the min distance between factors of n

    public static int minDistance (int n){

             int minDistance = n;
             for (int i = 1; i < n; i ++){
                 if (n%i == 0){
                     for (int j = 1; j < n; j ++){
                         if (n % j == 0 && i > j && i - j < minDistance){

                             minDistance = i - j;
                             return minDistance;



                             }

                         }
                     }
                 }
             return  0;
             }

   // Question 14 Wave array?


    public static int isWave(int [] a){
        for (int i = 0; i < a.length -1; i ++){
            if (a[i] % 2 == 0 && a[i + 1] % 2 == 0){
               return 0 ;
            }
            if (a[i] % 2 != 0 && a[i + 1] % 2 != 0){
                return 0;
            }
        }
        return 1;
    }

    //Question 15 digit frequency in a given number

    public  static int countDigit (int n , int digit){
        int digitFrequncy = 0;
        while (n != 0){
            if (n % 10 == digit ){
                digitFrequncy++ ;
            }
            n = n/10;
        }
        return digitFrequncy;
    }

   // Question 16 is Bunker Array?

    public static int isBunkerArray (int [] a){
        for (int i = 0; i < a.length - 1; i++){
            if (a[i] % 2 != 0){
                boolean isPrime = true;
                int nextNumber = a[i+1];

                for (int j = 2; j <= nextNumber/2; j++){
                    if (nextNumber % j == 0){
                        isPrime = false;
                        break;
                    }
                }


                if (isPrime && nextNumber > 1){
                    return 1;
                }

            }
        }
        return 0;
    }

  // Question 17 Is meerArray

  public static int isMeerArray (int [] a){

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (2 * a[i] == a[j]){
                    return 0;
                }
            }
        }
        return 1;
  }

  // Question 18 is it meer number? no of factors is also factor of the number

    public static int isMeera (int n){

        if(n ==1 ) return 0;
        int factorCounter = 0;
        for (int i = 2; i < n/2; i++){

            if (n % i == 0){
                factorCounter ++;
            }
        }
        if (n % factorCounter == 0){
            return 1;
        }
        return 0;
    }

  // Question 19 is there prime and num one in the array?

  public static int isBunker3(int [] a){
        for (int i = 0; i < a.length; i ++){
            boolean isPrime = true;
            for (int j = 2; j < a[i]/2; j ++){
                if (a[i] %  j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                for (int k = 0; k < a.length; k ++){
                    if (a[k] == 1){
                        return 1;
                    }
                }
            }
        }
        return 0;
  }

  // Using isPrime method

    public static int isBunker4(int [] a){
        for (int i = 0; i < a.length; i ++){
            if (isPrime(a[i]) == 1){
                for (int j = 0; j < a.length; j ++){
                    if (a[j] == 1){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

  // Question 20 are n + 1 and n - 1 in the array?

  public static int isNice(int [] a){

      for (int i = 0; i < a.length; i++){
          int num = a[i];
          boolean hasIncOrDecByOne = false;

          for (int j = 0; j < a.length; j++){
              if (num == a[j] + 1 || num == a[j] - 1) {
                  hasIncOrDecByOne = true;
                  break;
              }
          }

          if (!hasIncOrDecByOne) return 0;
      }
      return 1;
  }


  // Question 21 does a given number have a continuous factor?

    public static int isContinous (int num) {
        for(int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                int result = i;
                for (int j = i + 1; j <= num/2; j++) {
                    if (num % j != 0) break;
                    result = result * j;
                    if (result == num) return 1;
                }
            }
        }
        return 0;
    }

  // isContiniosFactored

    public static int isContiniousFacotred(int n){
        int result = 0;
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                result = i;
                for (int j = i + 1; j <= n/2; j++){
                    if (n % j != 0){
                        break;
                    }
                    result = result * j;
                    if (result == n){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }


  // Question 22 is every prime num in the array with its twin?


  public static int isTwin(int [] a){
        for (int i = 0; i < a.length; i++){
            int outerNum = a[i];
            if (isPrime(a[i]) == 1){
                boolean twinFlag = false;
                for (int j = 0; j < a.length; j++){
                    int innerNum = a[j];
                    if (isPrime(innerNum) == 1  && a[i] != a[j]){
                        if (innerNum - outerNum == 2 || outerNum - innerNum == 2) {
                            twinFlag = true;

                            System.out.println(a[i] + " " + a[j] + " " + twinFlag);
                            break;
                        }
                    }
                }

                if (!twinFlag) return 0;
            }
        }
        return 1;
  }

  // Question 23 is every even number in the array has its own double?

public static int isDoubled(int [] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 ==0 ) {
                boolean doubleFlag = false;
                for (int j = 0; j < arr.length; j++){
                    if (2 * arr[i] == arr[j]) {
                        doubleFlag = true;
                        break;
                    }
                }

                if (doubleFlag) {
                    return 1;
                }
            }
        }
        return 0;
    }
 // Question 24 do every element fond in a array in b array?

 public static int isSetEqual(int [] a , int [] b){
        for (int i = 0; i < a.length; i++) {
            boolean setFalag = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    setFalag = true;
                    break;
                }
            }
            if (!setFalag) {
                return 0;
            }
        }

     for (int k = 0; k < b.length; k++){
         boolean setFlag2 = false;
         for (int m = 0; m < a.length; m++){
             if(b[k] == a[m]){
                 setFlag2 = true;
                 break;
             }
         }

         if (!setFlag2) return 0;
     }

     return 1;
 }

 //Question 25 Does the given n found in a smart squence?
 public static int isSmart(int num){
        int sum = 1;

        for(int i = 1; sum <= num; i++) {
            if (sum == num) return 1;
            sum += i;
        }

        return 0;
 }

 // Question Is nice array?

 public static int isNiceArray(int [] a){
        int sum = 0;
        int firstElement = a[0];
        for (int i = 0; i < a.length; i++){
            if (isPrime(a[i]) == 1){
                sum = sum + a[i];
            }
        }
        if (sum == firstElement){
            return 1;
        }
        return 0;
 }

 // Question 26 isComplete 2;

 public static int  isComplete2(int [] a) {
     int maxEven = a[0];
     for (int i = 0; i < a.length; i++) {
         if (a[i] < 0) {
             return 0;
         }
         if (a[i] % 2 == 0 && maxEven <= a[i]) {
             maxEven = a[i];

         }}
         if (maxEven % 2 != 0) {
             return 0;
         }

     System.out.println(maxEven);
     for (int k = 2; k < maxEven; k++){
         if (k % 2 == 0){

         boolean isPresent = false;

         for (int j = 0; j < a.length; j++){
             if (k == a[j]){
                 isPresent = true;
                 break;
             }

         }
         if(!isPresent){
             return 0;
         }
     }}

 return 1;
 }

// Question 27 are the two numbers factor equal?

    public static int areEqualFactor(int a, int b){
        int counterA = 0;
        int counterB = 0;
        for (int i = 1; i <= a; i++){
            if (a % i == 0){
                counterA ++;
            }
        }
        for(int i = 1; i <= b; i++){
            if (b % i == 0){
                counterB ++;
            }
        }
          if (counterA == counterB){
              return 1;
          }
          return 0;
    }

// Question 28 is Merra?
public static int isMeera(int [] a){
    int sum = 0;

    for (int i = 0; i < a.length; i++){
        if (a[i] > i){
            return 0;
        }
    }

    if (sum == 0){
        return 1;
    }
    return 0;
}

// Question 29 isTriple array?

 public static int isTriple(int [] a){
        for (int i = 0; i < a.length; i++){
            int counter = 0;
            boolean isTripled = false;
            for (int j = 0; j < a.length; j++){
                if (a[i] == a[j]){
                    counter++;

                }
            }
            if (counter == 3){
                isTripled = true;
            }
            if (!isTripled){
                return 0;
            }
        }
        return 1;
 }

// Question 30 Fibonacci numbers{1,1,2,3,5,8,13,21,34...}

   public  static int isFibonacci(int n){
        int prevSum = 1;
        int currentSum = 1;
        int result = 0;
        for(int i = 0; i < n; i++){
            result = prevSum + currentSum;
            if (result == n){
                return 1;
            }
            prevSum = currentSum;
            currentSum = result;


   }
    return 0;}

 // Question 31 given n then find the n'th fibonacci number

public static int fibOFNum(int n){
        int fib1 = 0;
        int fib2 = 1;
        int result = 0;
        for (int i = 0; i <= n; i++){
            result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }
        return result;
}

// Question 32 isBeanArray?





        public static void main(String [] args){
        int[] array = { 1, 2, 1, 3, 1, 3, 2, 2} ;
        int [] array1 = {1,0,2,2,1,0,5};
        int result = fibOFNum(1000);
        System.out.println(result);


}}


