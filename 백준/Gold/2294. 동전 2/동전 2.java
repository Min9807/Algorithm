import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];
        int[] dp = new int[100001];

        for(int i=1; i<=K; i++) {
            dp[i] = 100001;
        }

        for(int i=0; i<N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
            if(coin[i] <= K) {
                dp[coin[i]] = 1;
            }
        }

        for(int i=1; i<=K; i++) {
            for(int j=0; j<N; j++) {
                if(i + coin[j] <= K) {
                    dp[i + coin[j]] = Math.min(dp[i+coin[j]], dp[i] + 1);
                }
            }
        }
        if(dp[K] == 100001) {
            System.out.println(-1);
        } else {
            System.out.println(dp[K]);
        }

    }
}