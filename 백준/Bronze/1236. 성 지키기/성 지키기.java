import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();

        char[][] map = new char[y][x];

        int w = 0;
        int h = 0;

        for(int i=0; i<y; i++) map[i] = sc.next().toCharArray();

        for(int i=0; i<y; i++){
            boolean check = true;
            for(int j=0; j<x; j++){
                if(map[i][j] == 'X'){
                    check = false;
                    break;
                }
            }
            if(check){
                w++;
            }
        }

        for(int i=0; i<x; i++){
            boolean check = true;
            for(int j=0; j<y; j++){
                if(map[j][i] == 'X'){
                    check = false;
                    break;
                }
            }
            if(check){
                h++;
            }
        }

        System.out.println(Math.max(w,h));
    }
}