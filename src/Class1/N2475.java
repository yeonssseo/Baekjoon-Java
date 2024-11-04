package Class1;

import java.util.Scanner;

public class N2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int num = 0;
            num = scanner.nextInt();
            sum += (num*num);
        }

        System.out.println(sum % 10);
    }
}
