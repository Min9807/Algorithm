import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] road = new int[N-1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++){
            road[i] = Integer.parseInt(st.nextToken());
        }

        int[] oil = new int[N];

        st = new StringTokenizer(br.readLine());
        int minOil = Integer.MAX_VALUE;
        for(int i=0; i<N-1; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a < minOil){
                minOil = a;
            }
            oil[i] = a;
        }
        oil[N-1] = Integer.MAX_VALUE;

        int ans = 0;
        for(int i=0; i<N-1; i++){
            if(oil[i] == minOil){
                for(int j=i; j<N-1; j++){
                    ans += minOil * road[j];
                }
                break;
            }else{
                ans += oil[i] * road[i];
            }
        }
        System.out.println(ans);


    }
}