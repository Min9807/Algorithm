import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] times = new int[N][2];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            times[i][0] = Integer.parseInt(st.nextToken());
            times[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(times, (v1, v2) -> (v1[0] - v2[0]));

        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(times[0][1]);
        for(int i=1; i<N; i++){
            if(q.peek() <= times[i][0]){
                q.poll();
            }
            q.offer(times[i][1]);
        }

        System.out.println(q.size());

    }
}