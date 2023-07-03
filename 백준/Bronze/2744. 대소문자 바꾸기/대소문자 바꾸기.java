import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.println(sb.toString());
    }
}