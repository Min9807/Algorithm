import java.util.*;
import java.io.*;
public class Main {
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int sum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int cnt = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] == 1){
                    sum = 0;
                    cnt++;
                    dfs(j, i, m, n);
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.println(cnt);
        System.out.println(max);
    }
    private static void dfs(int x, int y, int mapX, int mapY){
        sum++;
        map[y][x] = 0;
        for(int i=0; i<4; i++){
            int kx = x + dx[i];
            int ky = y + dy[i];
            if(kx >= 0 && kx <mapX && ky >= 0 && ky < mapY){
                if(map[ky][kx] == 1){
                    dfs(kx, ky, mapX, mapY);
                }
            }
        }
    }
}