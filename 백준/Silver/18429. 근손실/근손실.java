import java.util.*;
import java.io.*;
public class Main {
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] kit = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            kit[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            dfs(0, i, 500, new boolean[N], kit, K);
        }
        System.out.println(ans);
    }

    private static void dfs(int cnt, int start, int sum, boolean[] visited, int[] kit, int K){
        visited[start] = true;
        sum = sum + kit[start] - K;
        if(sum < 500){
            return;
        }
        if(cnt++ == visited.length-1){
            ans++;
        }else{
            for(int i=0; i< visited.length; i++){
                if(!visited[i]){
                    dfs(cnt, i, sum, visited, kit, K);
                    visited[i] = false;
                }
            }
        }
    }
}