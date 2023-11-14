import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            if (checkBalance(str)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean checkBalance(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if ((c == ')' || c == ']') && !stack.isEmpty()) {
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == ')' || c == ']') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}