import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] numAry = sc.next().split("");
        int sum = 0;
        for(String num : numAry){
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}