import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new TreeSet<>();

        while(N-- > 0){
            String[] ary = br.readLine().split(" ");
            if(ary[1].equals("enter")){
                set.add(ary[0]);
            }else{
                set.remove(ary[0]);
            }
        }

        String[] ans = set.toArray(new String[0]);
        for(int i=ans.length-1; i>=0; i--){
            bw.write(ans[i]+"\n");
        }

        bw.flush();
    }
}