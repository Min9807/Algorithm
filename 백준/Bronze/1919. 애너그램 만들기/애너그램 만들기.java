import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        int count = 0;

        Map<String, Integer> map = new HashMap<>();

        for(String str : word1.split("")){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for(String str : word2.split("")){
            if(map.containsKey(str) && map.getOrDefault(str, 0) > 0){
                map.put(str, map.get(str) - 1);
                count++;
            }

        }

        int result = word1.length() + word2.length() - count*2;
        
        System.out.println(result);

    }
}