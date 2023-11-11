import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int N = Integer.parseInt(br.readLine());
        int max = -1;
        int min = 1001;
        int[] container = new int[1001];
        int maxX = -1;
        int maxY = -1;
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            container[x] = y;
            if(maxY < y) {
                maxX = x;
                maxY = y;
            }
            max = Math.max(max, x);
            min = Math.min(min, x);
        }

        int maxValue = 0;

        for(int i=min; i<maxX; i++) {
            maxValue = Math.max(maxValue, container[i]);
            answer += maxValue;
        }
        maxValue = 0;

        for(int i=max; i>=maxX; i--) {
            maxValue = Math.max(maxValue, container[i]);
            answer += maxValue;
        }

        System.out.println(answer);
    }
}