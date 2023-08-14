import java.util.*;
import java.io.*;
public class Main {
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        while(K-- > 0){
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            for(int i=startY; i<endY; i++) {
                for (int j = startX; j < endX; j++) {
                    map[i][j] = 1;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 0){
                    list.add(dfs(i, j, M, N));
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int num : list){
            System.out.print(num + " ");
        }
    }

    private static int dfs(int y, int x, int M, int N){
        if(x < 0 || x >= N || y < 0 || y >= M || map[y][x] != 0) {
            return 0;
        }
        map[y][x] = 1;

        int size = 1;
        for(int i=0; i<4; i++){
            size += dfs(y + dy[i], x + dx[i], M, N);
        }
        return size;
    }
}