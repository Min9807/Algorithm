import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    static String[] graph;
    static boolean[] visited;
    static Set<String> answer = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();
        int L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i <C; i++) {
            String alphabet = st.nextToken();
            set.add(alphabet);
        }

        graph = set.toArray(new String[set.size()]);
        Arrays.sort(graph);
        visited = new boolean[set.size()];

        for(int i=0; i<set.size(); i++) {
            String[] ary = new String[L];
            dfs(i, 0, ary);
        }
        List<String> list = new ArrayList<>(answer);
        Collections.sort(list);
        for(String str : list) {
            System.out.println(str);
        }
    }
    private static void dfs(int start, int idx, String[] ary) {
        visited[start] = true;
        ary[idx++] = graph[start];
        if(idx == ary.length) {
            if(check(ary)) {
                Arrays.sort(ary);
                StringBuilder sb = new StringBuilder();
                for(String str : ary) {
                    sb.append(str);
                }
                answer.add(sb.toString());
            }
        } else{
            for(int i=start + 1; i<graph.length; i++) {
                if(!visited[i]) {
                    dfs(i, idx, ary);
                    visited[i] = false;
                }
            }
        }

    }

    private static boolean check(String[] ary) {
        int cnt1 = 0;
        int cnt2 = 0;
        for(String str : ary) {
            if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
                cnt1++;
            }else {
                cnt2++;
            }
        }
        if(cnt1 > 0 && cnt2 > 1){
            return true;
        }
        return false;
    }
}