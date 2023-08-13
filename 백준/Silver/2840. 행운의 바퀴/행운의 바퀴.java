import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] fan = new char[N];
        Arrays.fill(fan, '?');
        int idx = 0;
        while(K-- > 0){
            st = new StringTokenizer(br.readLine());
            idx += Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            idx = idx % N;
            if(fan[idx] == '?'){
                fan[idx] = c;
            }
            else if(fan[idx] != c){
                System.out.println("!");
                return;
            }
        }
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(fan[i] != '?' && fan[i] == fan[j]){
                    System.out.println('!');
                    return ;
                }
            }
        }
        

        for(int i=idx; i>=0; i--){
            System.out.print(fan[i]);
        }
        for(int i=N-1; i>idx; i--){
            System.out.print(fan[i]);
        }
    }
}