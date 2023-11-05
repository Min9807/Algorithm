import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> userInfo = new HashMap<>();
        int cnt = 0;
        for(int i=0; i<record.length; i++) {
            String[] info = record[i].split(" ");
            if(info[0].equals("Enter")) {
                userInfo.put(info[1], info[2]);
            }
            else if(info[0].equals("Change")) {
                userInfo.put(info[1], info[2]);
                cnt++;
            }
        }
        String[] answer = new String[record.length - cnt];
        int idx = 0;
        for(int i=0; i<record.length; i++) {
            String[] info = record[i].split(" ");
            if(info[0].equals("Enter")) {
                answer[idx++] = userInfo.get(info[1]) + "님이 들어왔습니다.";
            }
            else if(info[0].equals("Leave")) {
                answer[idx++] = userInfo.get(info[1]) + "님이 나갔습니다."; 
            }
        }
        return answer;
    }
}