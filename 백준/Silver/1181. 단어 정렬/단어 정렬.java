import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<String> list = new ArrayList<>();

        while(N-- > 0){
            String word = sc.next();
            if(!list.contains(word)){
                list.add(word);
            }
        }

        String[] ary = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            ary[i] = list.get(i);
        }

        Arrays.sort(ary, (v1, v2) -> {
            if(v1.length() == v2.length()){
                return v1.compareTo(v2);
            }
            return v1.length() - v2.length();
        });

        for(String str : ary){
            System.out.println(str);
        }
    }
}