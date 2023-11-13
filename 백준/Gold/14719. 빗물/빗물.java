import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int answer = 0;
        int[] blocks = new int[x];
        for(int i=0; i<x; i++) {
            blocks[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<x-1; i++) {
            int current = blocks[i];
            int leftMax = 0;
            int rightMax = 0;

            for(int j=i-1; j>=0; j--) {
                if(current < blocks[j]) {
                    leftMax = Math.max(leftMax, blocks[j]);
                }
            }

            for(int j=i+1; j<x; j++) {
                if(current < blocks[j]) {
                    rightMax = Math.max(rightMax, blocks[j]);
                }
            }

            if(Math.min(leftMax, rightMax) > current) {
                answer += Math.min(leftMax, rightMax) - current;
            }
        }

        System.out.println(answer);
    }
}