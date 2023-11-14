import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<String> st = new Stack<>();

        int answer = 0;
        String[] arr = str.split("");
        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals("(")) {
                st.push(arr[i]);
                continue;
            }
            else if(arr[i].equals("[")) {
                st.push(arr[i]);
                continue;
            }
            else if((arr[i].equals(")") || arr[i].equals("]")) && !st.isEmpty()) {
                if((st.peek().equals("(") && arr[i].equals("]")) || (st.peek().equals("[") && arr[i].equals(")"))) {
                    System.out.println(0);
                    return;
                }
                else if(arr[i].equals("]")) {
                    if(st.peek().equals("[")) {
                        st.pop();
                        st.push("3");
                    }
                    else {
                        int num = 0;
                        while(true) {
                            if(!st.isEmpty()) {
                                String x = st.pop();

                                if(x.equals("(")) {
                                    System.out.println(0);
                                    return;
                                }
                                else if(x.equals("[")) {
                                    break;
                                }
                                num += Integer.parseInt(x);
                            }
                            else {
                                System.out.println(0);
                                return;
                            }
                        }
                        num *= 3;

                        st.push(String.valueOf(num));
                    }
                    continue;
                }
                else if(arr[i].equals(")")) {
                    if(st.peek().equals("(")) {
                        st.pop();
                        st.push("2");
                    }
                    else {
                        int num = 0;
                        while(true) {
                            if(!st.isEmpty()) {
                                String x = st.pop();

                                if(x.equals("[")) {
                                    System.out.println(0);
                                    return;
                                }
                                else if(x.equals("(")) {
                                    break;
                                }
                                num += Integer.parseInt(x);
                            }
                            else {
                                System.out.println(0);
                                return;
                            }
                        }
                        num *= 2;
                        st.push(String.valueOf(num));
                    }
                    continue;
                }
            }
            System.out.println(0);
            return;
        }
        if(st.isEmpty()) {
            System.out.println(0);
            return;
        }
        while(!st.isEmpty()){
            String x = st.pop();
            if(x.equals("(") || x.equals("[")) {
                System.out.println(0);
                return;
            }
            answer += Integer.parseInt(x);
        }
        System.out.println(answer);

    }
}