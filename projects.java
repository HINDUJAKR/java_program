//1. ATM PIN Verification Program

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 0;
        boolean access = false;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();
            if (pin == correctPin) {
                access = true;
                break;
            }
            attempts++;
        }

        if (access)
            System.out.println("Access granted");
        else
            System.out.println("Account locked");
    }
}

//2. Array without duplicates 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}

//3. Car Speed Analysis

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] speeds = new int[n];
        for (int i = 0; i < n; i++) {
            speeds[i] = sc.nextInt();
        }

        int max = speeds[0];
        int min = speeds[0];
        int sum = 0;

        for (int speed : speeds) {
            if (speed > max) max = speed;
            if (speed < min) min = speed;
            sum += speed;
        }

        double avg = (double) sum / n;

        System.out.println("Highest speed: " + max);
        System.out.println("Lowest speed: " + min);
        System.out.println("Average speed: " + avg);
    }
}

//4. Secret Word Challenge

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if (word1.length() != word2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}

//5. Happy number or not?

import java.util.*;

public class Main {
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int slow = num, fast = num;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        if (slow == 1)
            System.out.println(num + " is a Happy Number");
        else
            System.out.println(num + " is Not a Happy Number");
    }
}

//6. Online Food Delivery System

import java.util.*;

class Restaurant {
    String name;

    Restaurant(String name) {
        this.name = name;
    }

    void bill() {
        System.out.println("Welcome to " + name + ". Base bill calculation in Restaurant.");
    }
}

class Order extends Restaurant {
    int quantity;
    double price;

    Order(String name, int quantity, double price) {
        super(name);
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    void bill() {
        double total = quantity * price;
        System.out.println("Order from " + name + ": Quantity = " + quantity + ", Price per item = " + price);
        System.out.println("Total Bill = " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Restaurant name: ");
        String rname = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        Restaurant r = new Restaurant(rname);
        r.bill();

        Order o = new Order(rname, qty, price);
        o.bill();
    }
}

