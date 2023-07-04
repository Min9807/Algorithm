import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        Map<String, Integer> map = new HashMap<>();

        for(String str : word.toUpperCase().split("")){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int count = 0;
        int max = 0;
        String result = "";
        for(String key : map.keySet()){
            if(max < map.get(key)){
                max = map.get(key);
            }
        }

        for(String key : map.keySet()){
            if(max == map.get(key)){
                count++;
                result = key;
            }
        }

        if(count > 1){
            System.out.println("?");
        }else{
            System.out.println(result);
        }
    }
}