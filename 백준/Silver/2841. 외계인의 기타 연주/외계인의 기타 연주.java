import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int cnt = 0;

        Stack<Integer>[] stack = new Stack[7];
        for(int i=1; i<=6; i++) {
            stack[i] = new Stack<>();
        }

        while(N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int plat = Integer.parseInt(st.nextToken());
            if(stack[num].isEmpty()) {
                stack[num].push(plat);
                cnt++;
            }
            else if(stack[num].peek() < plat) {
                stack[num].push(plat);
                cnt++;
            }
            else if(stack[num].peek() == plat) {
                continue;
            }
            else {
                while(true) {
                    if(stack[num].isEmpty()) {
                        break;
                    }
                    int top = stack[num].peek();
                    if(top <= plat) {
                        break;
                    }
                    stack[num].pop();
                    cnt++;
                }
                if(!stack[num].isEmpty()) {
                    if(stack[num].peek() == plat){
                        continue;
                    }
                }

                stack[num].push(plat);
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}