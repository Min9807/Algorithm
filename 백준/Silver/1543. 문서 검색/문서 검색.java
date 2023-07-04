import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        String result = input1.replace(input2, "");

        System.out.println((input1.length() - result.length()) / input2.length());

    }
}