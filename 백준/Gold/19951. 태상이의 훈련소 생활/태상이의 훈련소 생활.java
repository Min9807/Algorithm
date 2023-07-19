import java.util.*;

public class Main {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N+1];
        for(int i=1; i<N+1; i++){
            arr[i] = sc.nextInt();
        }

        int[] delta = new int[N+2];
        while(M-- > 0){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int k = sc.nextInt();

            delta[start] += k;
            delta[end+1] -= k;
        }

        int[] accDelta = new int[N+1];
        for(int i=1; i<=N; i++){
            accDelta[i] = accDelta[i-1] + delta[i];
        }

        for(int i=1; i<=N; i++){
            System.out.print(arr[i] + accDelta[i] + " ");
        }
    }
}