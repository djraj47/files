// program to read the Number from standard input

import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a Number :");
        num = sc.nextInt();
        System.out.println("Your number is " + num);
        sc.close();
    }
}