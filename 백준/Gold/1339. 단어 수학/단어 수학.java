import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] alphabet = new int[26];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            int len =str.length();
            int value = (int)Math.pow(10, len-1);
            for(int j=0; j<len; j++){
                alphabet[str.charAt(j) - 'A'] += value;
                value /= 10;
            }
        }
        Arrays.sort(alphabet);
        int sum =0;
        int value = 9;

        for(int i=25; i>=0; i--){
            if(alphabet[i] == 0) break;
            sum += alphabet[i] * value;
            value--;
        }

        System.out.println(sum);
    }
}