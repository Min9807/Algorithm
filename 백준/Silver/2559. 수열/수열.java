import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[S+1];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<S; i++){
            arr[i+1] = arr[i] + Integer.parseInt(st.nextToken());
        }

        int max = arr[N];

        for(int i=0; i<S-N; i++){
            max = Math.max(max, arr[N+i+1] - arr[i+1]);
        }

        System.out.println(max);

    }
}