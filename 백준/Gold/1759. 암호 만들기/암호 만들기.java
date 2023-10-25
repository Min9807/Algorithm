import java.util.*;
import java.io.*;
public class Main {
    static int L, C;
    static char[] input;
    static char[] password;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        input = new char[C];
        password = new char[L];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<C; i++) {
            input[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(input);
        find(0, 0, 0);
    }

    private static void find(int length, int idx, int cnt) {
        if(length == L) {
            if(cnt >= 1 && L - cnt >= 2) {
                System.out.println(password);
            }
            return;
        }
        if(idx < C) {
            password[length] = input[idx];
            int value = check(input[idx]) ? 1 : 0;
            find(length + 1, idx + 1, cnt + value);
            password[length] = 0;
            find(length, idx + 1, cnt);
        }
    }

    private static boolean check(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}