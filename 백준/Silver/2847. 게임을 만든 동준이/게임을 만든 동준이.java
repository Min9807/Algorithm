import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] inOrder = new int[N];
        for(int i=0; i<N; i++){
            inOrder[i] = Integer.parseInt(br.readLine());
        }
        int ans = 0;

        for(int i=N-1; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                if(inOrder[i] <= inOrder[j]){
                    while(inOrder[i] <= inOrder[j]){
                        ans++;
                        inOrder[j]--;
                    }
                }
            }
        }

        System.out.println(ans);

    }
}