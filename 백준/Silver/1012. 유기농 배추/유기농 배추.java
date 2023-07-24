import java.io.*;
import java.util.*;

public class Main {
    static int cnt = 0;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        // 테스트 개수만큼 반복
        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] map = new int[N][M];
            // 배추를 넣어주는 작업.
            cnt = 0;
            while(K-- > 0){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(map[i][j] == 1){
                        cnt++;
                        dfs(M, N, j, i, map);
                    }
                }
            }

            System.out.println(cnt);
        }
    }
    private static void dfs(int M, int N, int x, int y, int[][] map){
        map[y][x] = 0;
        for(int i=0; i<4; i++){
            int kx = x + dx[i];
            int ky = y + dy[i];
            if(kx >= 0 && kx < M && ky >= 0 && ky < N){
                if(map[ky][kx] == 1){
                    map[ky][kx] = 0;
                    dfs(M, N, kx, ky, map);
                }
            }
        }
    }
}