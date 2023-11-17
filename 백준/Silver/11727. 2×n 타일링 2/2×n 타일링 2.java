import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] memo = new long[10001];
        memo[1] = 1;
        memo[2] = 3;
        memo[3] = 5;
        for(int i=3; i<=N; i++) {
            memo[i] = (memo[i-1] + memo[i-2] + memo[i-2]) % 10007;
        }
        System.out.print(memo[N]);
    }
}