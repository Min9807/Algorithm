import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer firstLine = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(firstLine.nextToken());
        int M = Integer.parseInt(firstLine.nextToken());

        int[] numAry = new int[N];
        int[] sumPrefix = new int[N+1];
        StringTokenizer secondLine = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            numAry[i] = Integer.parseInt(secondLine.nextToken());
            sumPrefix[i+1] = sumPrefix[i] + numAry[i];
        }

        while(M-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken());
            int result = sumPrefix[end] - sumPrefix[start];
            bw.write(result + "\n");
        }
        bw.flush();
    }
}