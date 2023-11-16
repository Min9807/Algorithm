import java.util.*;
import java.io.*;
public class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        graph = new int[N][N];

        for(int i=0; i<N; i++) {
            String row = br.readLine();
            for(int j=0; j<N; j++) {
                graph[i][j] = row.charAt(j) - '0';
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(graph[i][j] == 1) {
                    int cnt = bfs(j, i);
                    list.add(cnt);
                }
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for(int num : list) {
            System.out.println(num);
        }

    }

    private static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        graph[y][x] = 0;
        int cnt = 0;
        while(!q.isEmpty()) {
            Node node = q.poll();
            cnt++;
            for(int i=0; i<4; i++) {
                int kx = dx[i] + node.x;
                int ky = dy[i] + node.y;
                if(kx >= 0 && kx < graph[0].length && ky >= 0 && ky < graph.length) {
                    if(graph[ky][kx] == 1) {
                        graph[ky][kx] = 0;
                        q.offer(new Node(kx, ky));
                    }
                }
            }
        }
        return cnt;
    }

    private static class Node {
        public int x;
        public int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}