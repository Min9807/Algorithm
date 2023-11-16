import java.util.*;
import java.io.*;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            N = Integer.parseInt(br.readLine());
            graph = new int[N+1][N+1];
            visited = new boolean[N+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1; i<=N; i++) {
                int num = Integer.parseInt(st.nextToken());
                graph[i][num] = 1;
                graph[num][i] = 1;
            }
            int cnt = 0;
            for(int i=1; i<=N; i++) {
                for(int j=1; j<=N; j++) {
                    if(!visited[j] && graph[i][j] == 1) {
                        cnt++;
                        visited[j] = true;
                        dfs(j);
                    }
                }
            }
            System.out.println(cnt);

        }
    }
    private static void dfs(int start) {
        visited[start] = true;
        for(int i=1; i<=N; i++) {
            if(!visited[i] && graph[start][i] == 1) {
                dfs(i);
            }
        }
    }
}