import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        String[] a = input1.split(":");
        String[] b = input2.split(":");

        int aSecond = Integer.parseInt(a[0])*3600 + Integer.parseInt(a[1])*60 + Integer.parseInt(a[2]);
        int bSecond = Integer.parseInt(b[0])*3600 + Integer.parseInt(b[1])*60 + Integer.parseInt(b[2]);

        int second = bSecond - aSecond;
        if(second <= 0){
            second += 24 * 3600;
        }

        int findHour = second / 3600;
        int findMin = (second % 3600) / 60;
        int findSec = second % 60;

        System.out.printf("%02d:%02d:%02d", findHour, findMin, findSec);

    }
}