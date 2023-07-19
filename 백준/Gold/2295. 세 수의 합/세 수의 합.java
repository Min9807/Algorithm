import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[N];
        int idx = 0;
        while(N-- > 0){
            numbers[idx++] = Integer.parseInt(br.readLine());
        }

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j< numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        int max = -1;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j< numbers.length; j++){
                int num = numbers[i] - numbers[j];
                if(set.contains(num)){
                    max = Math.max(max, numbers[i]);
                }
            }
        }
        System.out.println(max);

    }
}