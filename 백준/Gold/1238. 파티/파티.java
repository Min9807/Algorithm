import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int index, distance;

    public Node(int index, int distance){
        this.index = index;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node o){
        return this.distance - o.distance;
    }
}

public class Main {
    static int n, m, x;
    static int[][] graph;
    static int INF = (int)1e9;

    static int[] dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        int[] distance = new int[n+1];
        Arrays.fill(distance, INF);
        distance[start] = 0;

        while(!pq.isEmpty()){
            Node node = pq.poll();
            int dist = node.distance;
            int now = node.index;

            if(distance[now] < dist) continue;
            for(int i=1; i<=n; i++){
                if(graph[now][i] != INF){
                    int cost = dist + graph[now][i];
                    if(cost < distance[i]){
                        distance[i] = cost;
                        pq.offer(new Node(i, cost));
                    }
                }
            }
        }

        return distance;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        graph = new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            Arrays.fill(graph[i], INF);
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            graph[a][b] = t;
        }

        int[] result = new int[n+1];
        for(int i=1; i<=n; i++){
            int[] temp = dijkstra(i);
            result[i] = temp[x];
        }

        int[] reverse = dijkstra(x);
        for(int i=1; i<=n; i++){
            result[i] += reverse[i];
        }

        int max = Arrays.stream(result).max().getAsInt();
        System.out.println(max);
    }
}