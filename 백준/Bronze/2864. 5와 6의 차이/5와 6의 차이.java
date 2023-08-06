import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String num1 = st.nextToken();
        String num2 = st.nextToken();
        int[] ans = new int[2];
        ans[0] = Integer.parseInt(num1.replaceAll("6", "5")) + Integer.parseInt(num2.replaceAll("6", "5"));
        ans[1] = Integer.parseInt(num1.replaceAll("5", "6")) + Integer.parseInt(num2.replaceAll("5", "6"));
        System.out.println(ans[0] + " " + ans[1]);
    }
}