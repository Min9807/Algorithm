import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        List<Place> list = new ArrayList<>();
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());
            list.add(new Place(startTime, endTime));
        }
        Collections.sort(list, (v1, v2) -> {
            if(v1.start == v2.start) {
                return v1.end - v1.end;
            }
            return v1.start - v2.start;
        });

        PriorityQueue<Place> pq = new PriorityQueue<>((v1, v2) -> {
            return v1.end - v2.end;
        });

        for(Place p : list) {
            if(pq.isEmpty()) {
                pq.offer(p);
                continue;
            }
            while(!pq.isEmpty() && pq.peek().end <= p.start) {
                pq.poll();
            }
            pq.offer(p);
            answer = Math.max(answer, pq.size());
        }
        System.out.println(answer);
    }

    private static class Place {
        public int start;
        public int end;
        public Place(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}