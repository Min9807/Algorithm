import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        while(K-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Queue<Document> printer = new LinkedList<>();
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            List<Integer> importanceList = new ArrayList<>();

            for(int i=0; i<N; i++) {
                int importance = Integer.parseInt(st.nextToken());
                importanceList.add(importance);
                printer.offer(new Document(i, importance));
            }

            Collections.sort(importanceList);

            int cnt = 0;
            while(true) {
                Document document = printer.poll();
                if(document.importance == importanceList.get(importanceList.size()-1) && M == document.order) {
                    cnt++;
                    System.out.println(cnt);
                    break;
                }
                else if(document.importance == importanceList.get(importanceList.size()-1)) {
                    cnt++;
                    importanceList.remove(importanceList.size()-1);
                    continue;
                }
                printer.offer(document);
            }
        }
    }

    private static class Document {
        public int order;
        public int importance;

        public Document(int order, int importance) {
            this.order = order;
            this.importance = importance;
        }
    }
}