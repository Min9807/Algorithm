import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mapX = sc.nextInt();
        int mapY = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int h = sc.nextInt();

        int timeX = h % (2*mapX);
        int calcuX = 1;

        while(timeX-- > 0){
            if(x == mapX) calcuX = -1;
            else if (x == 0) calcuX = 1;
            x += calcuX;
        }

        int timeY = h % (2*mapY);
        int calcuY = 1;

        while(timeY-- > 0){
            if(y == mapY) calcuY = -1;
            else if (y == 0) calcuY = 1;
            y += calcuY;
        }

        System.out.println(x + " " + y);

    }
}