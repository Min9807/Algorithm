import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }
            String[] arr = str.split("");

            Stack<String> st = new Stack<>();

            for(String value : arr){
                if(value.equals("(") || value.equals("{") || value.equals("[")){
                    st.push(value);
                }else if(value.equals(")") || value.equals("}") || value.equals("]")){
                    if(st.isEmpty()){
                        st.push("sdfsdf");
                        break;
                    }
                    if(value.equals(")")){
                        value = "(";
                    }else if(value.equals("}")){
                        value = "{";
                    }else if(value.equals("]")){
                        value = "[";
                    }
                    String top = st.peek();
                    if(top.equals(value)){
                        st.pop();
                    }else{
                        break;
                    }
                }
            }
            if(!st.isEmpty()){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
}