import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int r = 0;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(r < num){
                r = num;
            }
            arr[i] = num;
        }

        int h = r;
        int l = 0;

        while(l <= h) {
            int mid = (l + h) / 2;
            long sum = 0; 

            for(int tree : arr){
                if(tree > mid){
                    sum += tree - mid;
                }
            }

            if(sum >= M){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        System.out.println(h);

    }
}