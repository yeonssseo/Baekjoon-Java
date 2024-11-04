package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
