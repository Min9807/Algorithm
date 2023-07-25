import java.io.*;
import java.util.*;

public class Main {
    static char[][] map1;
    static char[][] map2;
    static boolean[][] visited1;
    static boolean[][] visited2;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[] ans = new int[2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        map1 = new char[N][N];
        map2 = new char[N][N];
        visited1 = new boolean[N][N];
        visited2 = new boolean[N][N];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                char c = str.charAt(j);
                map1[i][j] = c;
                if(c == 'G'){
                    map2[i][j] = 'R';
                }else{
                    map2[i][j] = c;
                }
            }
        }
        for(int y=0; y<N; y++){
            for(int x=0; x<N; x++){
                if(!visited1[y][x]){
                    char c = map1[y][x];
                    ans[0]++;
                    dfs(x, y, N, map1, visited1, c);
                }
                if(!visited2[y][x]){
                    char c = map2[y][x];
                    ans[1]++;
                    dfs(x, y, N, map2, visited2, c);
                }
            }
        }

        System.out.println(ans[0] + " " + ans[1]);

    }
    private static void dfs(int x, int y, int N, char[][] map, boolean[][] visited, char c){
        visited[y][x] = true;
        for(int i=0; i<4; i++){
            int kx = x + dx[i];
            int ky = y + dy[i];

            if(kx >= 0 && kx < N && ky >= 0 && ky < N){
                if(map[ky][kx] == c && !visited[ky][kx]){
                    dfs(kx, ky, N, map, visited, c);
                }
            }
        }
    }
}