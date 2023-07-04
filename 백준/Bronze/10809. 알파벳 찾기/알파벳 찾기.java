import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] result = new int[26];
        Arrays.fill(result, -1);
        int count = -1;
        for(char c : input.toCharArray()){
            count++;
            if(result[c-97] != -1) continue;
            result[c-97] = count;
        }
        StringBuilder sb = new StringBuilder();
        for(int n : result){
            sb.append(n);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());

    }
}