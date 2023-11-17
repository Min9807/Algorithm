import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0; i<N; i++) {
            q.offer(sc.nextInt());
        }
        for(int i=1; i<N; i++) {
            for(int j=0; j<N; j++) {
                q.offer(sc.nextInt());
                q.poll();
            }
        }
        System.out.println(q.poll());
    }
}