import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int todayInt = Integer.parseInt(today.replaceAll("\\.", ""));
        List<Integer> list = new ArrayList<>();
        for(String term : terms) {
            char tType = term.charAt(0);
            int tPeriod = 0;
            if(term.length() > 4) {
                tPeriod = Integer.parseInt(term.substring(2, 5));
            } else if(term.length() > 3) {
                tPeriod = Integer.parseInt(term.substring(2, 4));
            } else {
                tPeriod = Integer.parseInt(term.substring(2, 3));
            }

            for(int i=0; i<privacies.length; i++) {
                char pType = privacies[i].charAt(11);
                String dateStr = privacies[i].substring(0, 10).replaceAll("\\.", "");
                if(pType == tType) { // 같은 종류인 경우.
                    StringBuilder sb = new StringBuilder();
                    int month = Integer.parseInt(dateStr.substring(4, 6)) + tPeriod;
                    int cnt = (month-1) / 12;
                    int day = Integer.parseInt(dateStr.substring(6, 8)) - 1;
                    if(day <= 0) {
                        day = 28;
                        month--;
                    }
                    int year = Integer.parseInt(dateStr.substring(0, 4));
                    
                    if(month > 12) {
                        month -= 12*cnt;
                        year += cnt;
                    }
                    if(month <= 0) {
                        month = 12;
                    }
                    sb.append(year);
                    
                    if(month < 10) {
                        sb.append("0" + month);
                    } else {
                        sb.append(month);
                    }
                    if(day < 10) {
                        sb.append("0" + day);
                    } else {
                        sb.append(day);
                    }
                    int date = Integer.parseInt(sb.toString());
                    if(date < todayInt) {
                        list.add(i+1);
                    }
                }
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        
        return answer;
    }
}