import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, -1 ,0 ,0, 1, -1, 1, -1};
    static int[] dy = {0, 0 , 1,-1, 1, 1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if(w == 0 && h == 0){
                break;
            }

            int[][] maps = new int[h][w];
            for(int i=0; i<h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<w; j++){
                    maps[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;

            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(maps[i][j] == 1){
                        cnt++;
                        dfs(j, i, w, h, maps);
                    }
                }
            }

            bw.write(cnt + "\n");
        }
        bw.flush();
    }

    private static void dfs(int x, int y, int w, int h, int[][] maps){
        maps[y][x] = 0;
        for(int i=0; i<8; i++){
            int kx = x + dx[i];
            int ky = y + dy[i];
            if(kx >= 0 && kx < w && ky >= 0 && ky < h){
                if(maps[ky][kx] == 1){
                    dfs(kx, ky, w, h, maps);
                }
            }
        }
    }
}