package dz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the a");
        int a = scanner.nextInt();
        System.out.println("Enter the b");
        int b = scanner.nextInt();
        System.out.printf("Sum a=%d, b=%d: %d \n", a,b,a+b);
        System.out.printf("Ruzn a=%d, b=%d: %d \n", a,b,a-b);
        System.out.printf("Umn a=%d, b=%d: %d \n", a,b,a*b);
        System.out.printf("Del a=%d, b=%d: %d \n", a,b,a/b);
        System.out.printf("Ost a=%d, b=%d: %d \n", a,b,a%b);
        scanner.close();
    }
}
