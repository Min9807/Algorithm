import java.util.*;
import java.io.*;
public class Main {
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] alphabet = new int[26];
        map = new char[y][x];
        for(int i=0; i<y; i++){
            char[] chars = br.readLine().toCharArray();
            for(int j=0; j<x; j++){
                map[i][j] = chars[j];
            }
        }
        int num = map[0][0] - 'A';
        alphabet[num]++;
        dfs(0, 0, 1, alphabet, x, y);
        System.out.println(answer);
    }

    private static void dfs(int x, int y, int sum, int[] alphabet, int mapX, int mapY){
        answer = Math.max(answer, sum);
        for(int i=0; i<4; i++){
            int kx = dx[i] + x;
            int ky = dy[i] + y;
            if(kx >= 0 && kx < mapY && ky >= 0 && ky < mapX){
                int a = map[kx][ky] - 'A';
                if(alphabet[a] == 0){
                    alphabet[a]++;
                    dfs(kx, ky, sum+1, alphabet, mapX, mapY);
                    alphabet[a]--;
                }
            }
        }
    }
}