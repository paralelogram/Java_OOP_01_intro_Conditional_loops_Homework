// created by
// group IFc-079.JavaCore
// student Andrii Sabii

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int height;

        Scanner scanner = new Scanner(System.in);
        System.out.print("input height of tree: ");
        height = scanner.nextInt();

        for (int i = 1; i <= height; i++){
            for (int j = 2; j <= height + i; j++) {
                if (j <= (height - i + 1) ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //happy New Year!!!
    }
}
