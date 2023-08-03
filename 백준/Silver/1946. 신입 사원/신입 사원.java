import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            int ans = 0;
            int[][] test = new int[N][2];
            for(int i=0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int score = Integer.parseInt(st.nextToken());
                int rank = Integer.parseInt(st.nextToken());
                test[i][0] = score;
                test[i][1] = rank;
            }

            Arrays.sort(test, (a, b) -> Integer.compare(a[0], b[0]));
            int min = Integer.MAX_VALUE;
            for(int[] rank : test){
                if(rank[1] < min){
                    ans++;
                    min = rank[1];
                }
            }
            System.out.println(ans);
        }

    }
}