import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        Arrays.fill(B, -1);  // B 배열을 -1로 초기화

        StringTokenizer stz = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stz.nextToken());
        }

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<N; i++){
            while(!st.empty() && A[st.peek()] < A[i]){
                B[st.pop()] = A[i];
            }
            st.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int num : B) {
            sb.append(num + " ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
    }
}