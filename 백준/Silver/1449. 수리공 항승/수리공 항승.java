import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] lines = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            lines[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lines);

        int start = lines[0];
        int ans = 1;

        for(int i=1; i<N; i++){
            if(lines[i] <= start + L - 1) continue;
            ans++;
            start = lines[i];
        }

        System.out.println(ans);

    }
}