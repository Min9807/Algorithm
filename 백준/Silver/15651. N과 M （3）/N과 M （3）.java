import java.util.*;
import java.io.*;
public class Main {

    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=1; i<=N; i++){
            dfs(0, i, N, M, new int[M]);
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int idx, int start, int N, int M, int[] visited) throws IOException {
        visited[idx] = start;
        if(idx == M-1){
            for(int num : visited){
                bw.write(num + " ");
            }
            bw.write("\n");
        }else if(idx < M-1){
            for(int i=1; i<=N; i++){
                dfs(idx+1, i, N, M, visited);
            }
        }
    }
}