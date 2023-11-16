import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited;
    static int[][] graphs;
    static int answer = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        graphs = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            graphs[num1][num2] = 1;
            graphs[num2][num1] = 1;
        }

        dfs(1);

        System.out.println(answer);
    }
    private static void dfs(int start) {
        answer++;
        visited[start] = true;
        for(int i=1; i< visited.length; i++) {
            if(!visited[i] && graphs[start][i] == 1) {
                dfs(i);
            }
        }
    }

}