import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> big = new PriorityQueue<>();
        while(N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if(small.size() == big.size()) small.offer(num);
            else big.offer(num);
            if(!small.isEmpty() && !big.isEmpty()) {
                int sNum = small.peek();
                int bNum = big.peek();
                if(sNum > bNum) {
                    small.poll();
                    big.poll();
                    small.offer(bNum);
                    big.offer(sNum);
                }
            }
            bw.write((small.peek()) + "\n");
        }
        bw.flush();
    }
}