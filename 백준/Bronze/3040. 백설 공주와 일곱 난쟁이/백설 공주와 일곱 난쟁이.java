import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] people = new int[9];
        int sum = 100;
        
        for(int i=0; i<9; i++){
            int num = Integer.parseInt(br.readLine());
            people[i] = num;
            sum -= num;
        }
        
        sum = Math.abs(sum);
        
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(people[i] + people[j] == sum){
                    people[i] = -1;
                    people[j] = -1;
                    break;
                }
            }
        }
        
        Arrays.sort(people);
        for(int i=2; i<9; i++){
            System.out.println(people[i]);
        }
        
    }
}