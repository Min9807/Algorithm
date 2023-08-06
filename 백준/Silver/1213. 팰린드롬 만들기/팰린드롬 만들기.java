import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String name = br.readLine();
        int[] alphabets = new int[26];

        for(int i=0; i<name.length(); i++){
            alphabets[name.charAt(i) - 'A']++;
        }

        int cnt = 0;
        char middleChar = 0;

        for(int i=0; i<26; i++){
            if(alphabets[i] % 2 == 1){
                cnt++;
                middleChar = (char) (i+'A');
            }
        }

        if(cnt > 1){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            for(int j=0; j<alphabets[i]/2; j++){
                sb.append((char)(i+'A'));
            }
        }

        String answer = sb.toString() + (cnt == 1 ? middleChar : "") + sb.reverse().toString();
        System.out.println(answer);
    }
}