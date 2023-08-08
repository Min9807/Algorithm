import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word1 = br.readLine();
        String word2 = br.readLine();
        int[] alphabet1 = new int[26];
        int[] alphabet2 = new int[26];
        for(char c : word1.toCharArray()){
            alphabet1[c-'a']++;
        }
        for(char c : word2.toCharArray()){
            alphabet2[c-'a']++;
        }
        int ans = 0;
        for(int i=0; i<26; i++){
            ans += Math.abs(alphabet1[i] - alphabet2[i]);
        }
        System.out.println(ans);
    }
}