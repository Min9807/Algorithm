import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] rank = new int[N];
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            rank[i] = a;
        }
        Arrays.sort(rank);
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += Math.abs(rank[i] - (i+1));
        }
        System.out.println(ans);
    }
}