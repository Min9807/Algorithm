import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(!list.contains(str)){
                list.add(str);
            }
        }
        String[] ary = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            ary[i] = list.get(i);
        }

        Arrays.sort(ary, (v1, v2) -> {
            if(v1.length() == v2.length()){
                return v1.compareTo(v2);
            }
            return v1.length() - v2.length();
        });

        for(String str : ary){
            System.out.println(str);
        }

    }
}
