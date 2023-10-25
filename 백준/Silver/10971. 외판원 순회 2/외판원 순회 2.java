import java.util.*;
import java.io.*;
public class Main {
    static int[][] route;
    static int min = Integer.MAX_VALUE;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        route = new int[N][N];
        visited = new boolean[N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                route[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0, 0, 0);
        System.out.println(min);

    }

    private static void dfs(int start, int end, int cost, int cnt) {
        if(cnt == route.length && start == end) {
            min = Math.min(min, cost);
            return;
        }
        for(int i=0; i<route.length; i++) {
            if(!visited[i] && route[end][i] != 0) {
                visited[i] = true;
                dfs(start, i, cost + route[end][i], cnt + 1);
                visited[i] = false;
            }
        }

    }
}