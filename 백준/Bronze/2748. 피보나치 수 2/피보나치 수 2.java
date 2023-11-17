import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] memo = new long[95];
        memo[1] = 1;
        for(int i=1; i<=N; i++) {
            memo[i+1] += memo[i];
            memo[i+2] += memo[i];
        }
        System.out.print(memo[N]);
    }
}