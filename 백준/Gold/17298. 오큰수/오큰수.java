import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        stack.push(0);
        int[] answer = new int[N];
        Arrays.fill(answer, -1);
        for(int i=1; i<arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                answer[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }

        for(int num : answer) {
            bw.write(num + " ");
        }
        bw.flush();
    }
}