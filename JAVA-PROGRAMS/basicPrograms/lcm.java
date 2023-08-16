// program to find LCM of two Numbers

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        boolean exit = false;
        int i = 2;
        while (exit != true) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("the factors of " + num1 + "and" + num2 + "is" + i);
                exit = true;
            }
            i++;

        }
    }
}
