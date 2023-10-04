import java.util.*;
import java.io.*;
public class Main {
    static List<Integer>[] tree;
    static boolean[] check;
    static int[] sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        check = new boolean[n + 1];
        sum = new int[n + 1];
        tree = new ArrayList[n + 1];

        for(int i=0; i<tree.length; i++){
            tree[i] = new ArrayList<>();
        }

        for(int i=0; i<n-1; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            tree[x].add(y);
            tree[y].add(x);
        }

        sum[r] = getSum(r);
        for(int i=0; i<q; i++){
            int answer = Integer.parseInt(br.readLine());
            System.out.println(sum[answer]);
        }
    }

    private static int getSum(int node){
        if(sum[node] != 0) return sum[node];

        check[node] = true;
        int result = 1;
        for(int child : tree[node]){
            if(!check[child]){
                result += getSum(child);
            }
        }
        return sum[node] = result;

    }
}