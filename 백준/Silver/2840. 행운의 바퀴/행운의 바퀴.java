import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        char[] lucky = new char[N];
        for(int i=0; i<N; i++){
            lucky[i] = '?';
        }

        int laps = 0;

        while(K-- > 0){
            laps += sc.nextInt();
            laps = laps % N;
            char c = sc.next().charAt(0);
            if(lucky[laps] == '?'){
                lucky[laps] = c;
            }else if(lucky[laps] != c){
                System.out.println('!');
                return ;
            }
        }
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(lucky[i] != '?' && lucky[i] == lucky[j]){
                    System.out.println('!');
                    return ;
                }
            }
        }

        while(N-- > 0){
            if(laps == -1){
                laps = lucky.length-1;
            }
            System.out.print(lucky[laps]);
            laps--;
        }

    }
}