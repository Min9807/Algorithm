import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            char[] chars = br.readLine().toCharArray();
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            for(char c : chars) {
                if(c == '-'){
                    if(!left.isEmpty()) {
                        left.pop();
                    }
                }
                else if(c == '<') {
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                }
                else if(c == '>') {
                    if(!right.isEmpty()) {
                        left.push(right.pop());
                    }
                }
                else {
                    left.push(c);
                }
            }
            StringBuilder sb = new StringBuilder();

            while(!left.isEmpty()) {
                sb.append(left.pop());
            }
            sb = new StringBuilder(sb.reverse());
            while(!right.isEmpty()) {
                sb.append(right.pop());
            }

            System.out.println(sb.toString());
        }

    }
}