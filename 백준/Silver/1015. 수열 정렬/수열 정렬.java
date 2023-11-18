import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] sortArr = new int[N];
        boolean[] visited = new boolean[N];
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            sortArr[i] = num;
        }

        int[] answer = new int[N];

        Arrays.sort(sortArr);
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(arr[i] == sortArr[j] && !visited[j]) {
                    visited[j] = true;
                    answer[i] = j;
                    break;
                }
            }
        }

        for(int i=0; i<N; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}