import java.util.*;
import java.io.*;
public class Main {
    static int s;
    static int[] numbers;
    static long answer = 0;
    static int status = -1;
    static final int LEFT = 0;
    static final int RIGHT = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        numbers = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        status = LEFT;
        solve(0, N/2, 0);

        status = RIGHT;
        solve(N/2, N, 0);

        if(s==0) answer--;
        System.out.println(answer);
    }
    static Map<Integer, Integer> cnt = new HashMap<>();
    private static void solve(int start, int end, int sum) {
        if(start == end) {
            if(status == LEFT) {
                int prev = cnt.getOrDefault(sum, 0);
                cnt.put(sum, prev + 1);
            }
            else if(status == RIGHT) {
                answer += cnt.getOrDefault(s - sum, 0);
            }
            return;
        }

        solve(start + 1, end, sum);
        solve(start + 1, end, sum + numbers[start]);
    }
}