import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Meet[] meets = new Meet[N];
        int idx = 0;

        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meets[idx++] = new Meet(start, end);
        }
        Arrays.sort(meets, (t1, t2) -> {
            if(t1.end == t2.end){
                return t1.start - t2.start;
            };
            return t1.end - t2.end;
        });
        int max = 1;
        int end = meets[0].end;
        for(int i=1; i<meets.length; i++){
            if(meets[i].start >= end){
                max++;
                end = meets[i].end;
            }
        }

        System.out.println(max);

    }

    private static class Meet{
        public int start;
        public int end;

        public Meet(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}