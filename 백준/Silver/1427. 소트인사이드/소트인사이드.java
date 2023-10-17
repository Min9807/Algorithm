import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] N = br.readLine().split("");
        int[] arr = new int[N.length];

        for(int i=0; i<N.length; i++) {
            arr[i] = Integer.parseInt(N[i]);
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=N.length-1; i >=0 ; i--) {
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}