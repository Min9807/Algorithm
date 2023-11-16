import java.util.*;
import java.io.*;
public class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] graph;
    static boolean[][] visited;
    static boolean[][] bfsVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        while(true) {
            visited = new boolean[N][M];
            answer++; // 연수 계산.
            int cnt = 0; // 빙산의 수
            bfsVisited = new boolean[N][M];
            boolean check = true; // dfs탐색 한번만 하도록.
            for(int i=1; i<N-1; i++) {
                for(int j=1; j<M-1; j++) {
                    if(graph[i][j] > 0 && check) {
                        check = false;
                        visited[i][j] = true;
                        dfs(j, i);
                    }
                    if(graph[i][j] > 0 && !bfsVisited[i][j]) {
                        bfsVisited[i][j] = true;
                        bfs(j, i);
                        cnt++;
                    }

                }
            }

            if(cnt == 0) {
                answer = cnt;
                break;
            }
            if(cnt > 1) {
                break;
            }
        }

        System.out.println(answer);
    }

    private static void dfs(int x, int y) {
        for(int i=0; i<4; i++) {
            int kx = x + dx[i];
            int ky = y + dy[i];
            if(kx >= 0 && kx < graph[0].length && ky >= 0 && ky < graph.length) {
                if(!visited[ky][kx]) {
                    if(graph[ky][kx] < 1) {
                        graph[y][x] -= 1;
                    }
                    else if(graph[ky][kx] > 0 && !visited[ky][kx]) {
                        visited[ky][kx] = true;
                        dfs(kx, ky);
                    }
                }
            }
        }
    }

    private static void bfs(int x, int y) {
        for(int i=0; i<4; i++) {
            int kx = x + dx[i];
            int ky = y + dy[i];
            if(kx >= 0 && kx < graph[0].length && ky >= 0 && ky < graph.length) {
                if(graph[ky][kx] > 0 && !bfsVisited[ky][kx]) {
                    bfsVisited[ky][kx] = true;
                    bfs(kx, ky);
                }
            }
        }
    }
}