import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        long[] line = new long[K];
        long r = 0;
        long l = 1;
        for(int i=0; i<K; i++){
            long value = Long.parseLong(br.readLine());
            if(value > r) r = value;
            line[i] = value;
        }

        long ans = 0;

        while(l <= r){
            long mid = l + (r - l) / 2;
            int sum = 0;
            for(long num : line){
                sum += num/mid;
            }
            if(sum >= N){
                ans = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        System.out.println(ans);
    }
}