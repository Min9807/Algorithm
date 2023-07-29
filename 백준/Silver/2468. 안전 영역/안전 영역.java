import java.io.*;
import java.util.*;

public class Main {
    static int[][] maps;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        maps = new int[N][N];
        int max = 0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int num = Integer.parseInt(st.nextToken());
                max = Math.max(max , num);
                maps[i][j] = num;
            }
        }
        for(int k=0; k<max; k++){
            visited = new boolean[N][N];
            int cnt = 0;
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(!visited[i][j] && maps[i][j] > k){
                        cnt++;
                        dfs(j, i, N, k);
                    }
                }
            }
            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);

    }
    private static void dfs(int x, int y, int N, int max){
        visited[y][x] = true;
        for(int i=0; i<4; i++){
            int kx = x + dx[i];
            int ky = y + dy[i];
            if(kx >= 0 && kx < N && ky >= 0 && ky <N){
                if(maps[ky][kx] > max && !visited[ky][kx]){
                    dfs(kx, ky, N, max);
                }
            }
        }
    }
}