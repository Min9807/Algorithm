import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for(int i=0; i<7; i++){
                int num = sc.nextInt();
                if(num % 2 == 0){
                    list.add(num);
                    sum += num;
                }
            }
            Collections.sort(list);
            System.out.println(sum + " " + list.get(0));
        }

    }

}