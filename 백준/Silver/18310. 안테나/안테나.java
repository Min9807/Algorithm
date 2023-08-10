import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] fruits = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            fruits[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(fruits);
        int ans = 0;
        int min = Integer.MAX_VALUE;
        if(N>1){
            for(int i=N/2-1; i<=N/2; i++){
                int distance = 0;
                for(int j=0; j<N; j++){
                    if(i==j) continue;
                    distance += Math.abs(fruits[i] - fruits[j]);
                }
                if(distance < min){
                    ans = fruits[i];
                    min = distance;
                }
            }
        }else{
            ans = fruits[0];
        }
        System.out.println(ans);
    }
}