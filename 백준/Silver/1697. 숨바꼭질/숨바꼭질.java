import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] visited = new int[MAX + 1];  // 0 to 100000
        Arrays.fill(visited, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        visited[N] = 0;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            if (now == K) {
                bw.write(String.valueOf(visited[now]));
                break;
            }

            int[] nextNode = {now - 1, now + 1, now * 2};

            for (int i = 0; i < 3; i++) {
                if (nextNode[i] >= 0 && nextNode[i] <= MAX) {
                    if (visited[nextNode[i]] == -1) {
                        queue.offer(nextNode[i]);
                        visited[nextNode[i]] = visited[now] + 1;
                    }
                }
            }
        }

        bw.flush();
    }
}