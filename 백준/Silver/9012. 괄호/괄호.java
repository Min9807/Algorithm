import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        while(N-- > 0){
            String[] ary = sc.next().split("");
            Stack<String> st = new Stack<>();
            boolean check = true;
            for(String str : ary){
                if(str.equals("(")){
                    st.push(str);
                }else if(str.equals(")") && !st.empty()){
                    st.pop();
                }else{
                    check = false;
                    break;
                }
            }
            if(!st.empty()){
                check = false;
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}