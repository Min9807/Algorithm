import java.util.*;
import java.io.*;
public class Main {
    static int[] like;
    static int[] parents;
    static List<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parents = new int[n + 1];
        like = new int[n + 1];
        tree = new ArrayList[n + 1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            tree[i] = new ArrayList<>();
            parents[i] = Integer.parseInt(st.nextToken());
            if(parents[i] == -1) continue;
            tree[parents[i]].add(i);
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            like[e] += cnt;
        }
        next(1);
        for(int i=1; i<=n; i++){
            System.out.print(like[i] + " ");
        }
    }
    private static void next(int node){
        for(int child : tree[node]){
            like[child] += like[node];
            next(child);
        }
    }
}