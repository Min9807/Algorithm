import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] wine = new int[N+1];
        int[][] d = new int[3][N+1];
        for(int i=1; i<=N; i++) {
            int num = Integer.parseInt(br.readLine());
            wine[i] = num;
        }
        d[0][1] = 0;
        d[1][1] = wine[1];
        d[2][1] = wine[1];

        for(int i=2; i<=N; i++) {
            d[0][i] = Math.max(d[0][i-1], Math.max(d[1][i-1], d[2][i-1]));
            d[1][i] = d[0][i-1] + wine[i];
            d[2][i] = d[1][i-1] + wine[i];
        }

        System.out.println(Math.max(d[0][N], Math.max(d[1][N], d[2][N])));
    }
}