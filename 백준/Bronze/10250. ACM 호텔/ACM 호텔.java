import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(T-- > 0){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int floor = N % H;
            int roomNum = 0;
            if(floor == 0){
                floor = H;
                roomNum = N / H;
            }else{
                roomNum = N / H + 1;
            }
            sb.append(floor);
            if(roomNum < 10){
                sb.append(0);
                sb.append(roomNum).append("\n");
            }else{
                sb.append(roomNum).append("\n");
            }
        }
        System.out.printf(sb.toString());
    }
}