import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] arr = s.substring(2, s.length() - 2).split("\\},\\{");
        
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length()); // 문자열 길이순으로 정렬
            }
        });
        
        int[] answer = new int[arr.length];
        
        int count = -1;
        
        for(String a : arr){
            String[] num = a.split(",");
            for(String b : num){
                int check = 0;
                for(int n : answer){
                    if(n == Integer.parseInt(b)){
                        check++;
                    }
                }
                if(check == 0){
                    count++;
                    answer[count] = Integer.parseInt(b);
                }
            }

        }

        return answer;
    }
}