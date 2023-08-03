import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int cnt = 1;
        while(A < B){
            if(B % 2 == 0){
                B /= 2;
                cnt++;
            }else{
                StringBuilder sb = new StringBuilder(String.valueOf(B));
                if(sb.toString().charAt(sb.length()-1) != '1'){
                    break;
                }
                sb.deleteCharAt(sb.length()-1);
                B = Long.parseLong(sb.toString());
                cnt++;
            }
        }
        if(A == B){
            System.out.println(cnt);
        }else{
            System.out.println(-1);
        }

    }
}

