import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] goal = new int[2];
        for(int i=0; i<2; i++){
            goal[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        List<Integer>[] list = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<>();
        }
        while(M-- > 0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        int ans = -1;
        boolean[] visited = new boolean[N+1];
        visited[goal[1]] = true;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(goal[1], 0, visited));
        while(!q.isEmpty()){
            Node node = q.poll();
            node.visited[node.num] = true;
            if(node.num == goal[0]){
                ans = node.cnt;
                break;
            }
            for(int idx : list[node.num]){
                if(!node.visited[idx]){
                    q.offer(new Node(idx, node.cnt + 1, node.visited));
                }
            }
        }

        System.out.println(ans);
    }

    private static class Node{
        public int num;
        public int cnt;
        public boolean[] visited;
        public Node(int num, int cnt, boolean[] visited){
            this.num = num;
            this.cnt = cnt;
            this.visited = visited;
        }
    }
}