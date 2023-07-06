import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            int number = sc.nextInt();
            int count = 0;

            int[] student = new int[20];
            for(int j=0; j<20; j++) student[j] = sc.nextInt();

            for(int k=0; k<20; k++){
                for(int c=0; c<k; c++){
                    if(student[k] < student[c]){
                        count++;
                    }
                }
            }

            System.out.println(number + " " + count);
        }
    }
}