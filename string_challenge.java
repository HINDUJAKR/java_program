//CHALLENGE ON ONE-COMPILER

//1. length of a string

import java.util.Scanner;
public class StringMethod1Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int length = inputString.length();
        System.out.println(length);
        scanner.close();
    }
}

//2. Join the strings 

import java.util.Scanner;
public class StringJoinerWithSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String result = first + " " + second;
        System.out.println(result);
        scanner.close();
    }
}

//3. Compare the strings 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        boolean areEqual = string1.equals(string2);
        System.out.println(areEqual);
        scanner.close();
    }
}

//4. First Character of the string 

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.charAt(0));
    }
}

//5. Last character of the string 

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.charAt(s.length()-1));
    }
}

//6. Join the first & last characters of the string 

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));
    }
}

//7. Alphanumeric strings

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean hasLetter=false, hasDigit=false;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)) hasLetter=true;
            if(Character.isDigit(c)) hasDigit=true;
        }
        System.out.println(hasLetter && hasDigit);
    }
}

//8. Uppercase check

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean allUpper=true;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c) && !Character.isUpperCase(c)){
                allUpper=false;
                break;
            }
        }
        System.out.println(allUpper);
    }
}

//9. Lowercase check

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean allLower=true;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c) && !Character.isLowerCase(c)){
                allLower=false;
                break;
            }
        }
        System.out.println(allLower);
    }
}

//10. String lengths equal or not 

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(s1.length() == s2.length());
    }
}

//11. Reverse a string

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String reversed="";
        for(int i=s.length()-1;i>=0;i--){
            reversed += s.charAt(i);
        }
        System.out.println(reversed);
    }
}

//12. Split strings by commas 

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] parts = s.split(",");
        for(String part : parts){
            System.out.println(part);
        }
    }
}

//13. remove the vowels 

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result = s.replaceAll("[AEIOUaeiou]", "");
        System.out.println(result);
    }
}





