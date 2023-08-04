import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] alphabet = new int[26];
        String[] arr = new String[N];

        while(N > 0){
            N--;
            arr[N] = br.readLine();
            int len = arr[N].length();
            int pow = (int)Math.pow(10, len-1);
            for(int i=0; i<len; i++){
                alphabet[arr[N].charAt(i) - 'A'] += pow;
                pow /= 10;
            }
        }

        Arrays.sort(alphabet);

        int sum = 0;
        int num = 9;
        for(int i=25; i>=0; i--){
            if(alphabet[i] == 0) break;
            sum += alphabet[i] * num;
            num--;
        }

        System.out.println(sum);
    }
}