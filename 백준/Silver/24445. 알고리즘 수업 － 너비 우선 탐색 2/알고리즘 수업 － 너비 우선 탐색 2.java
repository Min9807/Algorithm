import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graphs;
    static boolean[] visited;
    static int[] order;
    static int cnt = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        graphs = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graphs[i] = new ArrayList<>();
        }

        visited = new boolean[N+1];
        order = new int[N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graphs[a].add(b);
            graphs[b].add(a);
        }

        for(int i=1; i<=N; i++){
            Collections.sort(graphs[i], Collections.reverseOrder());
        }

        bfs(R);

        for(int i=1; i<=N; i++){
            System.out.println(order[i]);
        }
    }

    private static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        order[start] = cnt++;
        q.offer(start);

        while(!q.isEmpty()){
            int current = q.poll();

            for(int next : graphs[current]){
                if(!visited[next]){
                    visited[next] = true;
                    order[next] = cnt++;
                    q.offer(next);
                }
            }
        }
    }
}