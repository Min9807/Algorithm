import java.util.*;
import java.io.*;
public class Main {
    static long MAX = Long.MIN_VALUE;
    static long MIN = Long.MAX_VALUE;
    static int[] calcu;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        calcu = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            calcu[i] = Integer.parseInt(st.nextToken());
        }
        int[] sequence = new int[N-1];
        dfs(numbers, calcu, sequence, 0);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void dfs(int[] numbers, int[] calcu, int[] sequence, int cnt) {
        if(cnt == sequence.length) {
            long num = calcu(numbers, sequence);
            MAX = Math.max(num , MAX);
            MIN = Math.min(num , MIN);
            return;
        }
        for(int i=0; i<4; i++) {
            if(calcu[i] > 0) {
                calcu[i]--;
                sequence[cnt] = i;
                dfs(numbers, calcu, sequence, cnt + 1);
                calcu[i]++;
            }
        }
    }

    private static long calcu(int[] numbers, int[] sequence) {
        long sum = valid(numbers[0], numbers[1], sequence[0]);

        if(numbers.length > 2) {
            for(int i=2; i<numbers.length; i++) {

                sum = valid(sum, numbers[i], sequence[i-1]);
            }
        }

        return sum;
    }

    private static long valid(long num1, long num2, int calcu) {
        if(calcu == 0) {
            return num1 + num2;
        }
        else if(calcu == 1) {
            return num1 - num2;
        }
        else if(calcu == 2) {
            return num1 * num2;
        }
        else if(calcu == 3) {
            if(num1 == 0 || num2 == 0){
                return 0;
            }
            else if((num1 > 0 && num2 < 0) || (num1 < 0 && num2 > 0)){
                long value = Math.abs(num1) / Math.abs(num2);
                return -value;
            }
            else{
                return num1 / num2;
            }
        }
        return 0;
    }
}