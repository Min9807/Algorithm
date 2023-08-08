import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] gauss = new int[50];
        Arrays.fill(gauss, 10000000);
        for(int i=0; i<50; i++){
            int num = (i+1)*(i+2)/2;
            if(num>1000) break;
            gauss[i] = num;
        }

        while(N-- > 0){
            int K = Integer.parseInt(br.readLine());
            boolean checkGauss = calcu(K, gauss);
            System.out.println(checkGauss ? "1" : "0");
        }

    }
    private static boolean calcu(int k, int[] gauss){
        for(int first : gauss){
            for(int second : gauss){
                for(int third : gauss){
                    if(first + second + third == k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}