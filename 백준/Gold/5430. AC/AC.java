import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            char[] chars = br.readLine().toCharArray();
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine().replace("[", "");
            str = str.replace("]", "");
            Deque<Integer> q = new ArrayDeque<>();
            if(N > 0){
                for(String num : str.split(",")){
                    q.add(Integer.parseInt(num));
                }
            }
            boolean reverse = false;
            boolean error = false;
            for(int i=0; i<chars.length; i++){
                if(chars[i] == 'R'){
                    reverse = !reverse;
                }else{
                    if(q.size() == 0){
                        System.out.println("error");
                        error = true;
                        break;
                    }
                    if(reverse){
                        q.pollLast();
                    }else{
                        q.pollFirst();
                    }
                }
            }
            if(!error){
                StringBuilder sb = new StringBuilder("[");
                while(q.size() != 0){
                    sb.append(reverse ? q.pollLast() : q.pollFirst());
                    if(q.size() != 0){
                        sb.append(",");
                    }
                }
                sb.append("]");
                System.out.println(sb.toString());
            }
        }
    }
}