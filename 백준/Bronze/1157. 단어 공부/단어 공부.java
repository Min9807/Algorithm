import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toUpperCase();

        int[] count = new int[26];

        for(int i=0; i<word.length(); i++){
            count[word.charAt(i) - 'A']++;
        }

        int max = 0;
        char ans = '?';
        for(int i=0; i< count.length; i++){
            if(max < count[i]){
                max = count[i];
                ans = (char)(i + 'A');
            }
        }

        Arrays.sort(count);

        if(count[count.length-1] == count[count.length-2]){
            System.out.println("?");
        }else{
            System.out.println(ans);
        }

    }
}