import java.util.*;

public class Main {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N+1];

        for(int i=1; i<N+1; i++){
            arr[i] = arr[i-1] ^ sc.nextInt();
        }
        int sum = 0;
        while(Q-- > 0){
            int s = sc.nextInt();
            int e = sc.nextInt();

            sum ^= arr[e] ^ arr[s-1];
        }

        System.out.println(sum);


    }
}