import java.io.*;
import java.util.*;

public class Main {
    static int[][] graphs;
    static boolean[] visitedDFS;
    static boolean[] visitedBFS;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        graphs = new int[N + 1][N + 1];
        visitedDFS = new boolean[N + 1];
        visitedBFS = new boolean[N + 1];
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graphs[a][b] = graphs[b][a] = 1;
        }

        dfs(start, N + 1);
        System.out.print("\n");
        bfs(start, N + 1);
    }

    private static void dfs(int start, int N){
        System.out.print(start + " ");
        visitedDFS[start] = true;
        for(int i=1; i<N; i++){
            if(graphs[start][i] == 1 && !visitedDFS[i]){
                dfs(i, N);
            }
        }
    }

    private static void bfs(int start, int N){
        Queue<Integer> q = new LinkedList<>();
        visitedBFS[start] = true;
        q.offer(start);
        while(!q.isEmpty()){
            int a = q.poll();
            System.out.print(a + " ");
            for(int i=1; i<N; i++){
                if(graphs[a][i] == 1 && !visitedBFS[i]){
                    visitedBFS[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}