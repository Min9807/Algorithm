import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] person = new int[N];
        for(int i=0; i<N; i++){
            person[i] = sc.nextInt();
        }
        Arrays.sort(person);
        int sum = 0;
        int back = 0;
        for(int num : person){
            sum += back + num;
            back += num;
        }
        System.out.println(sum);
    }

}