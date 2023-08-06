import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        while(n % 5 != 0 && n > 1){
            ans++;
            n -= 2;
        }

        ans += n/5;
        n %= 5;

        if(n==0){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}