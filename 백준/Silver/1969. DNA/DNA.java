import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] cnt = new int[M][4];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            int idx = 0;
            for(char c : str.toCharArray()){
                if(c == 'A'){
                    cnt[idx][0]++;
                }else if(c == 'C'){
                    cnt[idx][1]++;
                }else if(c == 'G'){
                    cnt[idx][2]++;
                }else{
                    cnt[idx][3]++;
                }
                idx++;
            }
        }

        int ans = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++){
            char maxChar = 0;
            int maxCnt = 0;
            for(int j=0; j<4; j++){
                if(maxCnt < cnt[i][j]){
                    maxCnt = cnt[i][j];
                    if(j==0){
                        maxChar = 'A';
                    }else if(j==1){
                        maxChar = 'C';
                    }else if(j==2){
                        maxChar = 'G';
                    }else{
                        maxChar = 'T';
                    }
                }
            }
            sb.append(maxChar);
            ans += N-maxCnt;
        }
        System.out.println(sb.toString());
        System.out.println(ans);
    }
}