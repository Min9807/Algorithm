import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String target = br.readLine();
        String word = br.readLine();
        String str = target.replaceAll(word, "");
        System.out.println((target.length() - str.length()) / word.length());

    }
}