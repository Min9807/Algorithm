import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            String str = br.readLine();
            int check = calcu(str);
            System.out.println(check);
        }
    }
    private static int calcu(String str){
        StringBuilder sb = new StringBuilder(str);
        if(str.equals(sb.reverse().toString())){
            return 1;
        }
        for(int i=2; i<65; i++){
            int num = Integer.parseInt(str);
            sb = new StringBuilder();
            while(num > 0){
                int a = num%i;
                if(a < 10) sb.append(a);
                else{
                    sb.append((char)('A' + a - 10));
                }
                num/=i;
            }
            String word = sb.toString();
            if(word.equals(sb.reverse().toString())){
                return 1;
            }
        }
        return 0;
    }
}