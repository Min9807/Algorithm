import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            int[] numbers = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                numbers[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(numbers);
            int ans = 0;
            for(int i=2; i<N; i++){
                ans = Math.max(ans, numbers[i] - numbers[i-2]);
            }
            System.out.println(ans);

        }
    }
}