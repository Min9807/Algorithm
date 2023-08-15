import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {2, 2, 1, 1, -1, -1, -2, -2};
    static int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0){
            int k = Integer.parseInt(br.readLine());
            Queue<Node> q = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            q.offer(new Node(startX, startY, 0));
            boolean[][] visited = new boolean[k][k];
            visited[startX][startY] = true;

            int ans = 0;
            while(!q.isEmpty()){
                Node node = q.poll();
                if(node.x == endX && node.y == endY){
                    ans = node.cnt;
                    break;
                }
                for(int i=0; i<8; i++){
                    int kx = node.x + dx[i];
                    int ky = node.y + dy[i];
                    if(kx >= 0 && kx < k && ky >= 0 && ky < k){
                        if(!visited[kx][ky]){
                            visited[kx][ky] = true;
                            q.offer(new Node(kx, ky, node.cnt+1));
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
    private static class Node{
        public int x;
        public int y;
        public int cnt;
        public Node(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}