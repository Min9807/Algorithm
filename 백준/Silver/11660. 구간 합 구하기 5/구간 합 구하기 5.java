import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer first = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(first.nextToken());
        int M = Integer.parseInt(first.nextToken());

        int[][] map = new int[N][N];
        int[][] sumPrefix = new int[N+1][N+1];
        for(int i=0; i<N; i++){
            StringTokenizer mapData = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(mapData.nextToken());
                sumPrefix[i+1][j+1] = sumPrefix[i+1][j] + map[i][j];
            }
        }

        while(M-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            int sum = 0;

            for(int i=startX; i<=endX; i++){
                sum += sumPrefix[i][endY] - sumPrefix[i][startY-1];
            }
            bw.write(sum + "\n");
        }

        bw.flush();
    }
}