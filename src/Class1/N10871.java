package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int num = Integer.parseInt(st.nextToken());
        int com = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str, " ");

        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a < com) {
                System.out.print(a + " ");
            }
        }
    }
}
