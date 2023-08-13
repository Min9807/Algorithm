import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>();
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if(state.equals("enter")){
                set.add(name);
            }else{
                set.remove(name);
            }
        }

        String[] ans = set.toArray(new String[0]);
        for(int i=ans.length-1; i>=0; i--){
            bw.write(ans[i]+"\n");
        }

        bw.flush();
    }
}