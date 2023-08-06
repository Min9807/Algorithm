import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();
        int zeroCnt = 0;

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > 0) plus.add(num);
            else if (num < 0) minus.add(num);
            else zeroCnt++;
        }

        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minus);

        int plusIdx = 0;
        int minusIdx = 0;
        long result = 0;

        while(plusIdx + 1 < plus.size()){
            if(plus.get(plusIdx) == 1 || plus.get(plusIdx + 1) == 1) {
                result += plus.get(plusIdx) + plus.get(plusIdx + 1);
                plusIdx += 2;
            }else {
                result += plus.get(plusIdx) * plus.get(plusIdx + 1);
                plusIdx += 2;
            }
        }
        if(plusIdx < plus.size()){
            result += plus.get(plusIdx);
        }

        while(minusIdx +1 < minus.size()){
            result += minus.get(minusIdx) * minus.get(minusIdx + 1);
            minusIdx += 2;
        }
        if(minusIdx < minus.size() && zeroCnt == 0){
            result += minus.get(minusIdx);
        }

        System.out.println(result);
    }
}