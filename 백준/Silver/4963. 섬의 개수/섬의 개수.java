import java.util.*;
import java.io.*;

public class Main {
    static int[][] graphs;
    static int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
    static int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0) break;

            graphs = new int[h][w];
            for(int i=0; i<h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<w; j++) {
                    graphs[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    if(graphs[i][j] == 1) {
                        answer++;
                        dfs(j, i);
                    }
                }
            }
            System.out.println(answer);
        }
    }
    private static void dfs(int x, int y) {
        graphs[y][x] = 0;
        for(int i=0; i<8; i++) {
            int kx = x + dx[i];
            int ky = y + dy[i];
            if(kx >= 0 && kx < graphs[0].length && ky >= 0 && ky < graphs.length) {
                if(graphs[ky][kx] == 1) {
                    dfs(kx, ky);
                }
            }
        }
    }

}