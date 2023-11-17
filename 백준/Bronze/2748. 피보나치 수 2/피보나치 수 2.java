import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[] memo = new long[91];
        memo[1] = 1;
        memo[2] = 1;
        for(int i=3; i<=N; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        System.out.print(memo[N]);
    }
}