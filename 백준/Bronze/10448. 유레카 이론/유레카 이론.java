import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] gauss = new int[50];
        Arrays.fill(gauss, 10000000);
        for(int i=0; i<50; i++){
            int num = (i+1)*(i+2)/2;
            if(num>1000) break;
            gauss[i] = num;
        }

        while(count-- > 0){
            int K = sc.nextInt();
            boolean checkGauss = getCalcu(K, gauss);
            System.out.println(checkGauss ? "1" : "0");
        }
    }

    private static boolean getCalcu(int k, int[] gauss) {
        for(int first : gauss){
            for(int second : gauss){
                for(int third : gauss){
                    if(first + second + third == k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}