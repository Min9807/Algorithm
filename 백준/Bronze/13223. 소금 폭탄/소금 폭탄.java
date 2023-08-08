import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] current = br.readLine().split(":");
        String[] target = br.readLine().split(":");
        int currentSecond = Integer.parseInt(current[0]) * 3600 + Integer.parseInt(current[1]) * 60 + Integer.parseInt(current[2]);
        int targetSecond = Integer.parseInt(target[0]) * 3600 + Integer.parseInt(target[1]) * 60 + Integer.parseInt(target[2]);

        if(currentSecond >= targetSecond){
            targetSecond += 24 * 3600;
        }

        int result = targetSecond - currentSecond;

        int hours = result / 3600;
        result %= 3600;
        int minutes = result / 60;
        result %= 60;
        int seconds = result;

        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}