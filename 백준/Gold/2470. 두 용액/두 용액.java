import java.util.*;

public class Main {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;
        int ans1 = -1;
        int ans2 = -1;
        for(int i=0; i<N-1; i++){
            int pairValue = findValue(arr, i+1, N-1, arr[i]);
            int sum = Math.abs(arr[i] + pairValue);
            if(ans > sum){
                ans = sum;
                ans1 = arr[i];
                ans2 = pairValue;
            }
        }

        System.out.print(ans1 + " " + ans2);
    }
    private static int findValue(int[] arr, int fromIndex, int toIndex, int value){
        int find = 0;
        int PairAbs = Integer.MAX_VALUE;
        int l = fromIndex, r = toIndex;
        while(l <= r){
            int m = (l + r) / 2;
            int sum = value + arr[m];
            int sumAbs = Math.abs(sum);
            if(sumAbs < PairAbs){
                find = arr[m];
                PairAbs = sumAbs;
            }
            if(sum < 0) l = m + 1;
            else if(sum > 0) r = m - 1;
            else return arr[m];
        }
        return find;
    }
}