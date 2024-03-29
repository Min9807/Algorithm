import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];
        for(int i=0; i<N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[K+1];
        dp[0] = 1;
        for(int i=0; i<N; i++) {
            for(int j=0; j+coin[i]<=K; j++) {
                dp[j + coin[i]] += dp[j];
            }
        }
        System.out.println(dp[K]);
    }
}