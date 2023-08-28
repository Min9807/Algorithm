import java.util.*;
import java.io.*;
public class Main {

    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int[] numbers = new int[list.size()];
        for(int i=0; i<N; i++){
            numbers[i] = list.get(i);
        }
        Arrays.sort(numbers);

        for(int i=0; i<N; i++){
            dfs(0, i, N, M, new int[M], numbers, new boolean[N]);
        }

        bw.flush();
        bw.close();
    }

    private static void dfs(int idx, int numberIdx, int N, int M, int[] ans, int[] numbers, boolean[] visited) throws IOException {
        ans[idx] = numbers[numberIdx];
        visited[numberIdx] = true;
        if(idx == M-1){
            for(int num : ans){
                bw.write(num + " ");
            }
            bw.write("\n");
        }else if(idx < M-1){
            for(int i=0; i<N; i++){
                if(!visited[i]){
                    dfs(idx+1, i, N, M, ans, numbers, visited);
                    visited[i] = false;
                }
            }
        }
    }
}