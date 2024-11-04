package Class1;

import java.util.Scanner;

public class N2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        num = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
