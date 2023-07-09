import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        long[] S = new long[N+1];
        long[] cnt = new long[M];  
        cnt[0] = 1;

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
            cnt[(int)(S[i] % M)]++;
        }

        long ans = 0;
        for (int i=0; i<M; i++)
            ans += cnt[i] * (cnt[i] - 1) / 2;
        
        System.out.println(ans);
    }
}