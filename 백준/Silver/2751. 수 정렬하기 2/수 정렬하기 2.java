import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int[] ary = new int[T];
        for(int i=0; i<T; i++){
            ary[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ary);
        for(int n : ary){
            bw.write(n + "\n");
        }

        bw.flush();
    }

}