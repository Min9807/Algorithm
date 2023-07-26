import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] maps = new int[N][M];

        for(int i=0; i<N; i++){
            String row = br.readLine();
            for(int j=0; j<M; j++){
                maps[i][j] = row.charAt(j) - '0';
            }
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0));
        maps[0][0] = 0;
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.x == M-1 && node.y == N-1){
                System.out.print(node.sum);
                break;
            }
            for(int i=0; i<4; i++){
                int kx = node.x + dx[i];
                int ky = node.y + dy[i];
                if(kx >= 0 && kx < M && ky >= 0 && ky < N){
                    if(maps[ky][kx] == 1){
                        maps[ky][kx] = 0;
                        q.offer(new Node(kx, ky, node.sum + 1));
                    }
                }
            }
        }
    }

    private static class Node{
        public int x;
        public int y;
        public int sum;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
            this.sum = 1;
        }

        public Node(int x, int y, int sum){
            this.x = x;
            this.y = y;
            this.sum = sum;
        }
    }
}