import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] acc = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            acc[i] = acc[i-1] + Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for(int i=0; i<=N; i++){
            for(int j=i+1; j<=N; j++){
                if(acc[j] - acc[i] == M) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
