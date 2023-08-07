import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        int i =0 ;
        while (i < str.length()) {
            if (str.charAt(i) == '.') {
                sb.append('.');
                i++;
            }else {
                int count = 0;
                while (i < str.length() && str.charAt(i) == 'X') {
                    count++;
                    i++;
                }
                if (count % 2 == 1) {
                    System.out.println(-1);
                    return;
                }else {
                    sb.append("AAAA".repeat(count / 4));
                    sb.append("BB".repeat(count % 4 / 2));
                }
            }
        }
        System.out.println(sb.toString());
    }
}