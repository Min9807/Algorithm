import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringBuilder sb= new StringBuilder();
        char[] chars = str.toCharArray();
        int one = 0;
        int zero = 0;
        for(int i=0; i<chars.length; i++){
            if(i==0){
                if(chars[i] == '1'){
                    one++;
                }else{
                    zero++;
                }
                sb.append(chars[i]);
            }else if(sb.toString().charAt(sb.length()-1) == chars[i]){
                continue;
            }else{
                if(chars[i] == '1'){
                    one++;
                }else{
                    zero++;
                }
                sb.append(chars[i]);
            }
        }


        System.out.println(Math.min(one, zero));

    }
}