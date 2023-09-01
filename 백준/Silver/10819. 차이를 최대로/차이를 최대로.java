import java.util.*;
import java.io.*;
public class Main {

    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] number = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++){
            dfs(0, i, new int[N], number, new boolean[N]);
        }
        System.out.println(max);
    }

    private static void dfs(int idx, int start, int[] goal, int[] number, boolean[] visited){
        visited[start] = true;
        goal[idx++] = number[start];
        if(idx == goal.length){
            int sum = 0;
            for(int i=1; i<idx; i++){
                sum += Math.abs(goal[i-1] - goal[i]);
            }
            max = Math.max(max, sum);
        }else{
            for(int i=0; i< goal.length; i++){
                if(!visited[i]){
                    dfs(idx, i, goal, number, visited);
                    visited[i] = false;
                }
            }
        }
    }
}