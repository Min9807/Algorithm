import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited;
    static int[][] route;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N];
        route = new int[N][N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                route[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, 0, 0);

        System.out.println(answer);
    }

    private static void dfs(int cnt, int sum, int start, int end) {
        if(cnt == route.length && start == end) {
            answer = Math.min(answer, sum);
        }
        else {
            for(int i=0; i<route.length; i++) {
                if(!visited[i] && route[end][i] != 0) {
                    visited[i] = true;
                    dfs(cnt + 1, sum + route[end][i], start, i);
                    visited[i] = false;
                }
            }
        }
    }
}