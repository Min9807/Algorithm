import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[][] arr = new int[y][x];
        for(int i=0; i<y; i++){
            char[] chars = br.readLine().toCharArray();
            for(int j=0; j<x; j++){
                if(chars[j] == 'X'){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }

        int a = y;
        int b = x;
        for(int i=0; i<y; i++){
            for(int j=0; j<x; j++){
                if(arr[i][j] == 1){
                    a--;
                    break;
                }
            }
        }
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(arr[j][i] == 1){
                    b--;
                    break;
                }
            }
        }
        System.out.println(Math.max(a,b));
    }
}