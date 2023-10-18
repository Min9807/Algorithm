import java.util.*;
import java.io.*;
public class Main {
    static int s;
    static int[] numbers;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        numbers = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        find(0, 0);
        System.out.println(answer);
    }

    public static void find(int index, int sum) {
        if(index == numbers.length) return;
        if(sum + numbers[index] == s) answer++;

        find(index + 1, sum + numbers[index]);
        find(index + 1, sum);
    }


}