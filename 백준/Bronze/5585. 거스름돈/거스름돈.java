import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 1000 - Integer.parseInt(br.readLine());
        int[] exchange = {500, 100, 50, 10, 5, 1};
        int ans = 0;
        for(int i=0; i<6; i++){
            ans += N / exchange[i];
            N = N % exchange[i];
        }
        System.out.println(ans);
    }
}