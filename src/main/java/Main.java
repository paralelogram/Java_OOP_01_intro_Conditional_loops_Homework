// created by
// group IFc-079.JavaCore
// student Andrii Sabii

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input year");
        year = scanner.nextInt();

        if (year % 4 != 0 || year % 100 == 0 && year % 400 == 1) {
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }
    }
}
