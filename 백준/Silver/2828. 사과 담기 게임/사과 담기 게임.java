import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()) - 1;
        int J = Integer.parseInt(br.readLine());
        int basket = 1;
        int cnt = 0;
        while(J-- > 0){
            int position = Integer.parseInt(br.readLine());

            while(true){
                if((basket + M) >= position && basket <= position){
                    break;
                }else if((basket + M) < position){
                    basket++;
                    cnt++;
                }else if((basket) > position){
                    basket--;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);


    }
}
