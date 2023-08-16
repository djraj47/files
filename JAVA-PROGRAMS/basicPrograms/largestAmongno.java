
//program to find Largest number among 3 numbers

import java.util.Scanner;

public class largestAmongno {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int max = 0;
        if (max <= num1) {
            max = num1;
        }
        if (max <= num2) {
            max = num2;
        }
        if (max <= num3) {
            max = num3;
        }
        System.out.println("The largest number is " + max);

    }
}
