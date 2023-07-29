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

            for(int i=0; i<19; i++){
                if(numbers[i] > numbers[i+1]){
                    for(int j=i+1; j>0; j--){
                        if(numbers[j-1] > numbers[j]){
                            ans++;
                            int temp = numbers[j-1];
                            numbers[j-1] = numbers[j];
                            numbers[j] = temp;
                            continue;
                        }
                        break;
                    }
                }
            }

            System.out.println(num + " " + ans);
        }

    }
}