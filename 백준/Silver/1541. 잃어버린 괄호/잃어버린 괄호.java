import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().replaceAll("-", "+--");
        String[] arr = str.split("\\+-");

        int ans = 0;

        for(String value : arr){
            if(value.charAt(0) == '-'){
                int sum = 0;
                for(String value1 : value.split("\\+")){
                    int a = Math.abs(Integer.parseInt(value1));
                    sum += a;
                }
                ans = ans - sum;
            }
            else{
                for(String value1 : value.split("\\+")){
                    int a = Integer.parseInt(value1);
                    ans += a;
                }
            }
        }

        System.out.println(ans);


    }

}