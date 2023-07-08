import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer first = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(first.nextToken());
        int count = 1;
        if(N % 2 == 0 || N == 1){
            for(int i=3; i<N; i+=2){
                if(N % i == 0) count++;
            }
        }else{
            count++; // 2개 연속된 것.
            for(int i=2; i<N; i++){
                if(N % i == 0) count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
    }
}