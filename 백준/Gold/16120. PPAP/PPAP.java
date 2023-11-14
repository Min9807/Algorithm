import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();
        char[] rewind = new char[input.length];
        int rewindLength = 0;
        for(char ch : input) {
            rewind[rewindLength++] = ch;
            if(rewindLength >= 4 && rewind[rewindLength - 1] == 'P' && rewind[rewindLength - 2] == 'A' && rewind[rewindLength - 3] == 'P'
            && rewind[rewindLength - 4] == 'P') {
                rewindLength -= 3;
            }
        }

        System.out.println(rewindLength == 1 && rewind[0] == 'P' ? "PPAP" : "NP");
    }
}