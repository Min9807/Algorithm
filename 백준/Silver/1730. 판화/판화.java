import java.io.*;

public class Main {
    private static void upDown(char[][] map, int x, int y){
        if(map[y][x] == (char)46){
            map[y][x] = (char)124;
        }else if(map[y][x] == (char)45){
            map[y][x] = (char)43;
        }
    }
    private static void rightLeft(char[][] map, int x, int y){
        if(map[y][x] == (char)46){
            map[y][x] = (char)45;
        }else if(map[y][x] == (char)124){
            map[y][x] = (char)43;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        char[][] map = new char[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j] = (char)46;
            }
        }

        char[] positions = br.readLine().toCharArray();
        int x = 0;
        int y = 0;

        for(char position : positions){
            if(position == 'U'){
                if(y > 0){
                    upDown(map, x, y);
                    y--;
                    upDown(map, x, y);
                }
            }
            else if(position == 'D'){
                if(y < N-1){
                    upDown(map, x, y);
                    y++;
                    upDown(map, x, y);
                }
            }

            else if(position == 'L'){
                if(x > 0){
                    rightLeft(map, x, y);
                    x--;
                    rightLeft(map, x, y);
                }
            }

            else if(position == 'R'){
                if(x < N-1){
                    rightLeft(map, x, y);
                    x++;
                    rightLeft(map, x, y);
                }
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                bw.write(map[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
    }
}