import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        int pieces = 0;

        for(int i = 0; i < input.length(); i++){
            // 레이저
            if(input.charAt(i) == '('){
                stack.push('(');
            }
            else {
                stack.pop();
                if(input.charAt(i-1) == '('){
                    pieces += stack.size();
                }else{
                    pieces += 1;
                }
            }
        }
        System.out.println(pieces);
    }
}