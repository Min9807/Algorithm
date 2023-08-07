import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();
        int zeroCnt = 0;
        int ans = 0;

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > 0){
                plus.add(num);
            }else if(num < 0){
                minus.add(num);
            }else{
                zeroCnt++;
            }
        }

        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minus);
        for(int i=0; i< plus.size(); i++){
            if(i != plus.size()-1){
                if(plus.get(i) == 1 || plus.get(i+1) == 1){
                    ans += plus.get(i) + plus.get(i+1);
                }else{
                    ans += plus.get(i) * plus.get(i+1);
                }
                i++;
            }else{
                ans += plus.get(i);
            }
        }

        for(int i=0; i< minus.size(); i++){
            if(i == minus.size()-1 && minus.size() % 2 == 1){
                if(zeroCnt > 0){
                    break;
                }else{
                    ans += minus.get(i);
                }
            }else{
                ans += minus.get(i) * minus.get(i+1);
                i++;
            }
        }

        System.out.println(ans);
    }
}