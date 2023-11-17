import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();

        while(N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0 && q.isEmpty()) {
                bw.write("0\n");
            }
            else if(num == 0) {
                bw.write(q.poll()+"\n");
            }
            else {
                q.offer(num);
            }
        }
        bw.flush();
    }
}