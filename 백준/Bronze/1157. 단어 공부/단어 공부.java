import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        Map<String, Integer> map = new HashMap<>();

        for(String str : word.toUpperCase().split("")){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int max = 0;
        String result = "";
        for(String key : map.keySet()){
            if(max < map.get(key)){
                max = map.get(key);
                result = key;
            }
            else if(max == map.get(key)){
                result = "?";
            }
        }

        System.out.println(result);
    }
}