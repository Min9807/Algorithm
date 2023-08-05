import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int ans = N;
        while(N-- > 0){
            boolean[] alphabet = new boolean[26];
            char[] chars = br.readLine().toCharArray();
            for(int i=0; i<chars.length; i++){
                int index = chars[i] - 'a';
                if(i==0){
                    alphabet[index] = true;
                }else if(chars[i-1] == chars[i]){
                    continue;
                }else{
                    if(alphabet[index]){
                        ans--;
                        break;
                    }
                    alphabet[index] = true;
                }
            }
        }

        System.out.println(ans);


    }
}