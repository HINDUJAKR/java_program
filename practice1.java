//1. sum of the digits

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sum = 0;
      while(num>0){
        int a = num%10;
        sum = sum+a;
        num = num/10;
      }
      System.out.println(sum);
      
      
  }
}

//2. prime number or not 

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i;
        boolean isPrime = true;
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        if (num <= 1) {
            isPrime = false;
        } else {
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");
    }
}

//3. factorial

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        long fact = 1; 
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

//4. reverse a number

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sum = 0;
      while(num>0){
        int a = num%10;
        sum = sum*10+a;
        num = num/10;
      }
      System.out.println(sum);
      
      
  }
}

//5. Palindrome 

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, originalNum, reversed = 0;
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        originalNum = num; 
        
        while (num != 0) {
            int digit = num % 10;         
            reversed = reversed * 10 + digit;  
            num = num / 10;               
        }
        
        if (originalNum == reversed)
            System.out.println(originalNum + " is a Palindrome");
        else
            System.out.println(originalNum + " is Not a Palindrome");
    }
}

//6. Amstrong 

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, originalNum, remainder, result = 0, digits = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        originalNum = num;
        while (originalNum != 0) {
            originalNum /= 10;
            digits++;
        }
        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, digits);
            originalNum /= 10;
        }
        if (result == num)
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is Not an Armstrong Number");
    }
}





