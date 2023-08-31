import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int ans = 0;
        String str = br.readLine();
        char[] bench = str.toCharArray();

        for(int i=0; i<N; i++){
            if(bench[i] == 'P'){
                boolean check = true;
                for(int j=K; j>=1; j--){
                    if((i - j) >= 0){
                        if(bench[i-j] == 'H'){
                            ans++;
                            bench[i-j] = 'O';
                            check = false;
                            break;
                        }
                    }
                }
                if(check){
                    for(int j=1; j<=K; j++){
                        if((i + j) < N){
                            if(bench[i+j] == 'H'){
                                ans++;
                                bench[i+j] = 'O';
                                break;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}