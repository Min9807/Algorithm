import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int minPrice1 = Integer.MAX_VALUE;
        int minPrice2 = Integer.MAX_VALUE;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            minPrice1 = Math.min(a, minPrice1);
            minPrice1 = Math.min(minPrice1, b*6);
            minPrice2 = Math.min(b, minPrice2);
        }

        int ans = (N / 6) * minPrice1;
        
        if((N%6) * minPrice2 > minPrice1){
            ans += minPrice1;
        }else{
            ans += (N % 6) * minPrice2;
        }
        System.out.println(ans);

    }
}