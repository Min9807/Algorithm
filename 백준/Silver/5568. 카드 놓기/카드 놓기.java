import java.util.*;
import java.io.*;
public class Main {

    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] card = new int[n];
        for(int i=0; i<n; i++){
            card[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<n; i++){
            dfs(0, i, new int[k], new boolean[n], card);
        }
        System.out.println(set.size());
    }

    private static void dfs(int idx, int start, int[] goal, boolean[] visited, int[] card){
        visited[start] = true;
        goal[idx++] = card[start];
        if(idx == goal.length){
            StringBuilder sb = new StringBuilder();
            for(int num : goal){
                sb.append(num);
            }
            set.add(Integer.parseInt(sb.toString()));
        }else{
            for(int i=0; i< visited.length; i++){
                if(!visited[i]){
                    dfs(idx, i, goal, visited, card);
                    visited[i] = false;
                }
            }
        }
    }
}