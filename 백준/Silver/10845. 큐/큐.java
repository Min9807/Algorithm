import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int back = 0;
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                back = num;
                queue.offer(num);
            }else if(command.equals("front")){
                if(queue.size() == 0){
                    bw.write("-1\n");
                }else{
                    bw.write(queue.peek() + "\n");
                }
            }else if(command.equals("back")){
                if(queue.size() == 0){
                    bw.write("-1\n");
                }else{
                    bw.write(back + "\n");
                }
            }else if(command.equals("size")){
                bw.write(queue.size() + "\n");
            }else if(command.equals("pop")){
                if(queue.size() == 0){
                    bw.write("-1\n");
                }else{
                    bw.write(queue.remove() + "\n");
                }
            }else if(command.equals("empty")){
                bw.write(queue.isEmpty() ? "1" + "\n" : "0" + "\n");
            }
        }

        bw.flush();
    }
}