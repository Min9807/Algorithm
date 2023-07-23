import java.util.*;

public class Main {
    static int cnt = 0;
    static int[] a = {0, -1, 0, 1};
    static int[] b = {1, 0, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] map = new int[N][N];
        for(int i=0; i<N; i++){
            String[] numbers = sc.next().split("");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 1){
                    cnt = 1;
                    dfs(map, i, j);
                    list.add(cnt);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int num : list){
            System.out.println(num);
        }
    }
    private static void dfs(int[][] map, int y, int x){

        map[y][x] = 0;
        for(int i=0; i<4; i++){
            int dx = x + a[i];
            int dy = y + b[i];
            if(dx >= 0 && dy >= 0 && dx < map[0].length && dy < map[0].length){
                if(map[dy][dx] == 1){
                    cnt++;
                    dfs(map, dy, dx);
                }
            }
        }
    }
}