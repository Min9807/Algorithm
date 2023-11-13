import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> buffer = new LinkedList<>();

        while(true) {
            int packet = Integer.parseInt(br.readLine());
            if(packet == -1) {
                break;
            }
            else if(packet == 0) {
                buffer.poll();
            }
            else if(buffer.size() < N) {
                buffer.offer(packet);
            }
        }

        while(!buffer.isEmpty()) {
            System.out.print(buffer.poll() + " ");
        }
    }
}