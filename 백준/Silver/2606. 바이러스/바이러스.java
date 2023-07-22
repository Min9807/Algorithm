import java.util.*;

public class Main {
    static int[][] computers;
    static boolean[] visited;
    static int count = 0;

    public static void dfs(int start, int n) {
        visited[start] = true;
        for (int i = 1; i <= n; i++) {
            if (computers[start][i] == 1 && !visited[i]) {
                count++;
                dfs(i, n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 컴퓨터의 수
        int m = sc.nextInt();  // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수
        computers = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            computers[a][b] = computers[b][a] = 1;
        }

        dfs(1, n);
        System.out.println(count);
    }
}