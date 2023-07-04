import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        StringBuilder sb1 = new StringBuilder(String.valueOf(n1)).reverse();
        int num1 = Integer.parseInt(sb1.toString());
        StringBuilder sb2 = new StringBuilder(String.valueOf(n2)).reverse();
        int num2 = Integer.parseInt(sb2.toString());

        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}