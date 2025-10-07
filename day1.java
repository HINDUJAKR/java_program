//1.Input and Output Practice
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      System.out.println(num1);
      
      float num2 = sc.nextFloat();
      System.out.println(num2);
      
      sc.nextLine();
      
      char val = sc.nextLine().charAt(0);
      System.out.println(val);
      
      long num3 = sc.nextLong();
      System.out.println(num3);
      
      double num4 = sc.nextDouble();
      System.out.println(num4);
  }
}

//2.Progressive float execution
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double num = sc.nextDouble();
      System.out.printf("%.5f\n", num);
      System.out.printf("%.4f\n", num);
      System.out.printf("%.3f\n", num);
      System.out.printf("%.2f\n", num);
      System.out.printf("%.1f\n", num);
      System.out.println((int)num); 
  }
}

//3.Mathematical functions
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int add = A+B;
      int sub = A-B;
      int mul = A*B;
      int quo = A/B;
      int rem = A%B;
      System.out.println(add);
      System.out.println(sub);
      System.out.println(mul);
      System.out.println(quo);
      System.out.println(rem);
  }
}

//4.ASCII

import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println((char)n);
  }
}

//5.Update counter
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int out1 = n+5;
      int out2 = out1*2;
      int out = out2-3;
      //int out = ((n + 5) * 2) - 3;
      System.out.println(out);
  }
}

//6.Odd or Even
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      if (num%2 == 0){
        System.out.println("Even");
      }
      else{
        System.out.println("Odd");
      }
  }
}

//7.Greatest among 3
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int gr;
      if (a>=b && a>=c){
        gr = a;
      }
      else if (b>=a && b>=c){
        gr = b;
      }
      else{
        gr = c;
      }
      System.out.println(gr);
  }
}

//8.Char digit to integer

import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int val = ch - '0'; 
        System.out.println(val);
  }
}

//9.Personalized greeting
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      System.out.println("Hi " + name + ", welcome to the programming class!");
    }
}

//10.Total and average
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      int s1 = sc.nextInt();
      int s2 = sc.nextInt();
      int s3 = sc.nextInt();
      int s4 = sc.nextInt();
      int s5 = sc.nextInt();
      System.out.println("Student Name: " + name);
      int total = s1+s2+s3+s4+s5;
      System.out.println("Total Marks: " + total);
      double avg = (double) total / 5;
      System.out.printf("Average Marks: %.2f\n", avg);
  }
}

//11.Area calculation
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner o = new Scanner(System.in);
      int s = o.nextInt();
      int l = o.nextInt();
      int br = o.nextInt();
      int r = o.nextInt();
      int ba = o.nextInt();
      int h = o.nextInt();
      double pi = 3.14;
      System.out.println("Area of Square="+(s*s));
      System.out.println("Area of Rectangle="+(l*br));
   
      System.out.printf("Area of Circle=%.2f\n",pi*Math.pow(r,2));
      System.out.println("Area of Triangle="+(int)((0.5)*ba*h));
  }
}

//12.Perimeter calculation 
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();      
      int l = sc.nextInt();     
      int w = sc.nextInt();     
      int r = sc.nextInt();     
      int b1 = sc.nextInt();   
      int s = sc.nextInt();     
      int b2 = sc.nextInt(); 
      
      int sq = 4 * a;
      int rec = 2 * (l + w);
      double cir = 2 * 3.14 * r;
      int tri = b1 + s + b2;
      
      System.out.println(sq);
      System.out.println(rec);
      System.out.printf("%.2f\n", cir);
      System.out.println(tri);
  }
}

//13.Mixed input
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      sc.nextLine();
      String str = sc.nextLine();
      System.out.println(num);
      System.out.println(str);
  }
}