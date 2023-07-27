import java.io.*;
import java.util.*;

public class Main {
    static int[][] maps;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        maps = new int[M][N];
        Queue<Node> q = new LinkedList<>();
        boolean isUnripe = false;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                int a = Integer.parseInt(st.nextToken());
                if(a == 1){
                    q.offer(new Node(j, i, 0));
                } else if(a == 0) {
                    isUnripe = true;
                }
                maps[i][j] = a;
            }
        }

        if(!isUnripe){
            System.out.println("0");
            return;
        }

        int ans = 0;

        while(!q.isEmpty()){
            Node node = q.poll();
            ans = node.day;
            for(int i=0; i<4; i++){
                int kx = node.x + dx[i];
                int ky = node.y + dy[i];
                if(kx>=0 && kx<N && ky>=0 && ky<M){
                    if(maps[ky][kx] == 0){
                        maps[ky][kx] = 1;
                        q.offer(new Node(kx, ky, node.day + 1));
                    }
                }
            }
        }



        System.out.println(checkTomato(maps, N, M) ? ans : "-1");
    }

    private static class Node{
        public int x;
        public int y;
        public int day;
        public Node(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    // 토마토 상자에
    private static boolean checkTomato(int[][] maps, int N, int M){
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(maps[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

}