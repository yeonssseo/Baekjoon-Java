package Class1;

import java.util.Scanner;

public class N1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a > b) {
            System.out.println(">");
        } else if(a == b) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }
}
