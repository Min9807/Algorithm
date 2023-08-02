import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long S = Long.parseLong(br.readLine());
        long N = 1;
        while ((N * (N + 1)) / 2 <= S) {
            N++;
        }

        // S를 넘어섰을 때의 N에서 1을 빼줌
        System.out.println(N-1);

    }
}