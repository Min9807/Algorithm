import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] order;
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        order = new int[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            graph[a].add(b);
            graph[b].add(a);
        }
        for(int i=1; i<=N; i++){
            Collections.sort(graph[i], Collections.reverseOrder());
        }
        
        bfs(R);
        
        for(int i=1; i<=N; i++){
            System.out.println(order[i]);
        }

    }
    
    private static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        order[start] = cnt++;
        
        while(!q.isEmpty()){
            int num = q.poll();
            for(int next : graph[num]){
                if(!visited[next]){
                    visited[next] = true;
                    order[next] = cnt++;
                    q.offer(next);
                }
            }
        }
    }

}