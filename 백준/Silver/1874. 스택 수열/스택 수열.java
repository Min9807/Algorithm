import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        int cnt = 0;
        StringBuilder result = new StringBuilder();

        while(num-- > 0) {
            int input = Integer.parseInt(br.readLine());

            if(cnt < input) {
                while(cnt < input) {
                    stack.push(++cnt);
                    result.append("+\n");
                }
                stack.pop();
                result.append("-\n");
            } else {
                boolean check = false;
                if(!stack.isEmpty()) {
                    result.append("-\n");
                    if(stack.pop() == input)
                        check = true;
                }
                if(!check) {
                    result.replace(0, result.length(), "NO");
                    break;
                }
            }
        }
        System.out.println(result.toString());
    }
}