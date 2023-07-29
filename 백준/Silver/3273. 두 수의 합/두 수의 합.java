
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] ary = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            ary[i] = Integer.parseInt(st.nextToken());
        }

        int goal = Integer.parseInt(br.readLine());
        int ans = 0;
        Arrays.sort(ary);
        int start = 0;
        int end = N-1;
        while(start < end){
            int sum = ary[start] + ary[end];
            if(sum == goal){
                ans++;
                start++;
            }else if(sum < goal){
                start++;
            }else{
                end--;
            }
        }
        System.out.println(ans);
    }
}