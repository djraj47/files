// program to find a given number is odd or even

import java.util.Scanner;

public class oddOReven {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "is a EVEN number");
        }
        if (num % 2 != 0) {
            System.out.println(num + "is a ODD number");
        }
    }
}
