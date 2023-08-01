import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int ans = 1;
        Node[] graph = new Node[N];
        int idx = 0;
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            graph[idx++] = new Node(start, end);
        }
        Arrays.sort(graph, (v1, v2) -> {
            if(v1.end  == v2.end){
                return v1.start - v2.start;
            }
            return v1.end - v2.end;
        });

        int end = graph[0].end;

        for(int i=1; i<graph.length; i++){
            if(graph[i].start >= end){
                end = graph[i].end;
                ans++;
            }
        }


        System.out.println(ans);
    }

    private static class Node{
        public int start;
        public int end;

        public Node(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}