import java.util.*;
import java.io.*;

public class Main {
    static int[] operators = new int[4];
    static int[] number;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        number = new int[N];
        for(int i=0; i<N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(number[0], 1);

        System.out.println(max);
        System.out.println(min);
    }
    private static void dfs(int sum, int cnt) {
        if(cnt == number.length) {
            max = Math.max(sum, max);
            min = Math.min(sum, min);
        }
        else {
            for(int i=0; i<4; i++) {
                if(operators[i] > 0) {
                    operators[i]--;
                    switch(i) {
                        case 0:
                            dfs(sum + number[cnt], cnt + 1);
                            break;
                        case 1:
                            dfs(sum - number[cnt], cnt + 1);
                            break;
                        case 2:
                            dfs(sum * number[cnt], cnt + 1);
                            break;
                        case 3:
                            dfs(sum / number[cnt], cnt + 1);
                            break;
                    }
                    operators[i]++;
                }
            }
        }
    }
}