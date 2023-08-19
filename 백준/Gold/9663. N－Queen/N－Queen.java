import java.io.*;
public class Main {
    static int[][] map;
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            map = new int[N][N];
            map[0][i] = 1;
            dfs(0, 1, N);
        }
        System.out.println(ans);
    }
    private static void dfs(int depth, int cnt, int N){
        depth++;
        if(cnt == N){
            ans++;
        }
        else{
            for(int i=0; i<N; i++){
                if(valid(i, depth, N)){
                    map[depth][i] = 1;
                    dfs(depth, cnt+1, N);
                    map[depth][i] = 0;
                }
            }
        }
    }

    private static boolean valid(int x, int y, int N){
        for(int i=0; i<y; i++){
            if(map[i][x] == 1){
                return false;
            }
            if((y-i-1) >=0 && (x-i-1) >= 0){
                if(map[y-i-1][x-i-1] == 1){
                    return false;
                }
            }
            if((y-i-1) >= 0 && (x+i+1) < N){
                if(map[y-i-1][x+i+1] == 1){
                    return false;
                }
            }
        }
        return true;
    }
}
