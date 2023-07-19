import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<Integer> set = new TreeSet<>();
        int[] numbers = new int[N];
        int idx = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(N-- > 0){
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
            numbers[idx++] = num;
        }

        Map<Integer, Integer> map = new HashMap<>();
        idx = 0;
        for(int num : set){
            map.put(num, idx++);
        }
        for(int number : numbers){
            bw.write(map.get(number) + " ");
        }
        bw.flush();


    }
}