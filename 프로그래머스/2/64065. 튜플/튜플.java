import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("\\{", "");
        String[] arr = s.split("\\}");
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++) {
            String[] intArr = arr[i].split(",");
            for(String strNum : intArr) {
                if(!strNum.equals("")) {
                    int num = Integer.parseInt(strNum);
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }
        }
        
        int[] answer = new int[map.size()];
        int[][] intArr = new int[map.size()][2];
        int idx = 0;
        for(int key : map.keySet()) {
            intArr[idx][0] = key;
            intArr[idx][1] = map.get(key);
            idx++;
        }
        Arrays.sort(intArr, (v1, v2) -> {
            return v2[1] - v1[1];
        });
        for(int i=0; i<map.size(); i++) {
            answer[i] = intArr[i][0];
        }
        return answer;
    }
}