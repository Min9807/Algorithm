import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine());

        while(P-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int ans = 0;

            int[] numbers = new int[20];
            for(int i=0; i<20; i++){
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=0; i<20; i++){
                for(int j=0; j<i; j++){
                    if(numbers[i] < numbers[j]) ans++;
                }
            }

            System.out.println(num + " " + ans);
        }

    }
}