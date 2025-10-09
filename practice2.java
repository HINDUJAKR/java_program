//1. First and second maximum

import java.util.Scanner;

public class SimpleMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i, first, second;
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        first = second = arr[0];
        
        for (i = 1; i < 5; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        
        System.out.println("First Max: " + first);
        System.out.println("Second Max: " + second);
    }
}

//2. Reverse the elements of array

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=n-1;i>=0;i--)
            System.out.print(a[i]+" ");
    }
}


//3. Array without duplicates 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 5, 2, 1, 6, 7, 9, 9};
        int temp[] = new int[arr.length];
        Arrays.sort(arr);
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }

        temp[j] = arr[arr.length - 1];

        System.out.println(Arrays.toString(arr));

        for (int k = 0; k <= j; k++) {
            System.out.print(temp[k] + " ");
        }
    }
}

//4. Print the duplicates of the array

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Duplicate elements:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        sc.close();
    }
}

//5. Basic 2D array

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//6. Add the corners of 2D array

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = arr[0][0] + arr[0][cols - 1] + arr[rows - 1][0] + arr[rows - 1][cols - 1];
        System.out.println("Sum of corner elements: " + sum);
        sc.close();
    }
}

//7. Add the diagonals of the 2D array 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int primary = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            primary += arr[i][i];
            secondary += arr[i][n - 1 - i];
        }
        System.out.println("Sum of primary diagonal: " + primary);
        System.out.println("Sum of secondary diagonal: " + secondary);
        sc.close();
    }
}

//8. Basic 3D array 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of 3D array (x y z): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[][][] arr = new int[x][y][z];
        System.out.println("Enter elements:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("3D Array elements:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}

//9. Basic Jagged array 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] jagged = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of elements in row " + (i+1) + ": ");
            int cols = sc.nextInt();
            jagged[i] = new int[cols];
            System.out.println("Enter elements for row " + (i+1) + ":");
            for (int j = 0; j < cols; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//10. Using array, convert the uppercase to lowercase and vise versa

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z')
                arr[i]=(char)(arr[i]+32);
            else if(arr[i]>='a' && arr[i]<='z')
                arr[i]=(char)(arr[i]-32);
        }
        System.out.println(new String(arr));
    }
}





