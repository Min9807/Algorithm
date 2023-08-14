import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited;
    static int[] graph;
    static List<Integer>[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        graph = new int[N+1];
        tree = new ArrayList[N+1];
        for (int i = 0; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }
        visited = new boolean[N+1];
        int cnt = N-1;
        while(cnt-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }
        dfs(1, N);

        for(int i=2; i<=N; i++){
            bw.write(graph[i] + "\n");
        }
        bw.flush();
    }

    private static void dfs(int start, int N){
        visited[start] = true;
        for(int i: tree[start]){
            if(!visited[i]){
                graph[i] = start;
                dfs(i, N);
            }
        }
    }
}