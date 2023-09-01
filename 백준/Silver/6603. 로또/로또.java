import java.util.*;
import java.io.*;
public class Main {

    static BufferedWriter bw;
    static int[] numbers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            if(k == 0){
                break;
            }
            numbers = new int[k];
            for(int i=0; i<k; i++){
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            int[] goal = new int[6];
            boolean[] visited = new boolean[k];
            for(int i=0; i<=k-6; i++){
                dfs(0, i, visited, goal, i);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int idx, int start, boolean[] visited, int[] goal, int min) throws IOException {
        visited[start] = true;
        goal[idx++] = numbers[start];
        if(idx == goal.length){
            for(int num : goal){
                bw.write(num + " ");
            }
            bw.write("\n");
        }else{
            for(int i=min; i< numbers.length; i++){
                if(!visited[i] && (6-idx) <= (numbers.length - i + 1)){
                    dfs(idx, i, visited, goal, i+1);
                    visited[i] = false;
                }
            }
        }
    }
}