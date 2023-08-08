import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String commend = st.nextToken();
            if(commend.equals("push_front")){
                int num = Integer.parseInt(st.nextToken());
                q.offerFirst(num);
            }else if(commend.equals("push_back")){
                int num = Integer.parseInt(st.nextToken());
                q.offerLast(num);
            }else if(commend.equals("pop_front")){
                if(q.size() == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(q.pollFirst());
                }
            }else if(commend.equals("pop_back")){
                if(q.size() == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(q.pollLast());
                }
            }else if(commend.equals("size")){
                System.out.println(q.size());
            }else if(commend.equals("empty")){
                if(q.size() == 0){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(commend.equals("front")){
                if(q.size() == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(q.peekFirst());
                }
            }else if(commend.equals("back")){
                if(q.size() == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(q.peekLast());
                }
            }
        }
    }
}