import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> q = new PriorityQueue<>();
        while(N-- > 0){
            q.offer(Long.parseLong(br.readLine()));
        }

        long ans = 0;

        if(q.size() > 1){
            while(q.size() != 1){
                long a = q.poll();
                long b = q.poll();
                ans += a+b;
                q.offer(a+b);
            }
        }else{
            ans = 0;
        }

        System.out.println(ans);
    }
}