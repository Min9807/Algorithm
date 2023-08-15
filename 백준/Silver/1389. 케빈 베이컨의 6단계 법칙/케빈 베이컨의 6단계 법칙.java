import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] edge = new int[N+1][N+1];

        while(M-- > 0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edge[a][b] = edge[b][a] = 1;
        }
        int minIdx = -1;
        int minValue = Integer.MAX_VALUE;

        for(int i=1; i<=N; i++){
            int sum = 0;
            for(int j=1; j<=N; j++){
                if(j==i) continue;
                Queue<Node> q = new LinkedList<>();
                q.offer(new Node(i, 0));
                boolean[] visited = new boolean[N+1];
                while(!q.isEmpty()){
                    Node node = q.poll();
                    visited[node.start] = true;
                    if(node.start == j){
                        sum += node.cnt;
                        break;
                    }
                    for(int k=1; k<=N; k++){
                        if(!visited[k] && edge[k][node.start] == 1){
                            q.offer(new Node(k, node.cnt+1));
                        }
                    }

                }
            }

            if(sum < minValue){
                minIdx = i;
                minValue = sum;
            }
        }
        System.out.println(minIdx);
    }

    private static class Node{
        public int start;
        public int cnt;
        public Node(int start, int cnt){
            this.start = start;
            this.cnt = cnt;
        }
    }
}