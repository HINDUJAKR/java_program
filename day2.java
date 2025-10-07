//1. Identify the Nature of a Number

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0)
            System.out.println("POSITIVE");
        else if(n < 0)
            System.out.println("NEGATIVE");
        else
            System.out.println("ZERO");
    }
}

//2.Explore Math Functions

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int sqrtNum = sc.nextInt();
        int base = sc.nextInt();
        int power = sc.nextInt();
        System.out.println((int)Math.floor(num));
        System.out.println((int)Math.ceil(num));
        System.out.println(Math.round(num));
        System.out.println((int)Math.sqrt(sqrtNum));
        System.out.println((int)Math.pow(base, power));
    }
}

//3. Smallest of Four Numbers

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int min = Math.min(Math.min(a, b), Math.min(c, d));
        System.out.println(min);
    }
}

//4. Truncate to Two Decimal Places

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double truncated = (int)(num * 100) / 100.0;
        System.out.printf("%.2f", truncated);
    }
}

//5. Find Second Maximum Number

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c)
            System.out.println("No second max");
        else {
            int max, second;
            if (a > b) {
                max = a;
                second = b;
            } else {
                max = b;
                second = a;
            }
            if (c > max) {
                second = max;
                max = c;
            } else if (c > second && c != max) {
                second = c;
            }
            System.out.println(second);
        }
    }
}

//6. Triangle Angle Validation

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A + B + C == 180 && A > 0 && B > 0 && C > 0) {
            System.out.println("VALID");
            if (A == B && B == C)
                System.out.println("EQUILATERAL");
            else if (A == B || B == C || A == C)
                System.out.println("ISOSCELES");
            else
                System.out.println("SCALENE");
        } else {
            System.out.println("NOT VALID");
        }
    }
}

//7. Number to Word

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println(words[n]);
    }
}

//8. Vowel or Consonant 

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
           ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}

//9. Leap Year Checker 

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

//10. Fun Grade Calculator

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }
        int avg = sum / 5;
        if(avg >= 90) {
            System.out.println("Excellent!");
        } else if(avg >= 80) {
            System.out.println("Great Job!");
        } else if(avg >= 70) {
            System.out.println("Good Effort!");
        } else if(avg >= 50) {
            System.out.println("Keep Trying!");
        } else {
            System.out.println("Better Luck Next Time!");
        }
    }
}

//11. Train Berth Type Finder

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seat = sc.nextInt();
        int mod = seat % 8;
        switch(mod) {
            case 1: case 4:
                System.out.println("LB");
                break;
            case 2: case 5:
                System.out.println("MB");
                break;
            case 3: case 6:
                System.out.println("UB");
                break;
            case 7:
                System.out.println("SL");
                break;
            case 0:
                System.out.println("SU");
                break;
        }
    }
}

//12. Electricity Bill Calculator

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double units = sc.nextDouble();
        double bill = 0;
        if(units <= 50) {
            bill = units * 1;
        } else if(units <= 150) {
            bill = 50 * 1 + (units - 50) * 2;
        } else if(units <= 250) {
            bill = 50 * 1 + 100 * 2 + (units - 150) * 3;
        } else {
            bill = 50 * 1 + 100 * 2 + 100 * 3 + (units - 250) * 4;
        }
        if(bill > 150) {
            bill += bill * 0.2;
        }
        System.out.println((int)bill);
    }
}

//13. Thala vs Thalapathy Game

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0) {
            System.out.println("ThalaThalapathy");
        } else if(n % 3 == 0) {
            System.out.println("Thala");
        } else if(n % 5 == 0) {
            System.out.println("Thalapathy");
        } else {
            System.out.println(n);
        }
    }
}

//14. Train Fare Calculator

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int distance = sc.nextInt();
        double fare = distance * 5;
        if(age < 12) {
            fare *= 0.5;
        } else if(age >= 60) {
            fare *= 0.75;
        }
        System.out.println((int)fare);
    }
}

//15. Average Marks Calculator

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }
        double avg = sum / 5.0;
        if(avg == (int)avg) {
            System.out.println((int)avg);
        } else {
            System.out.printf("%.2f\n", avg);
        }
    }
}

//16. Fun Character Case Converter 

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z') {
            System.out.println((char)(ch - 'a' + 'A'));
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println((char)(ch - 'A' + 'a'));
        } else {
            System.out.println("abcd theriyatha?");
        }
    }
}


