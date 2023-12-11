import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;
        int y = 0;
        List<String> list = new ArrayList<>();
        for(char c : dirs.toCharArray()) {
            String nowLocation = "(" + x + "," + y + ")";
    
            if(c == 'U') {
                if(y == 5) continue;
                y++;
            } else if(c == 'L') {
                if(x == -5) continue;
                x--;
            } else if(c == 'R') {
                if(x == 5) continue;
                x++;
            } else if(c == 'D') {
                if(y == -5) continue;
                y--;
            }
            String nextLocation = "(" + x + "," + y + ")";
            String route1 = nowLocation + nextLocation;
            String route2 = nextLocation + nowLocation;
            if(!list.contains(route2) && !list.contains(route1)) {
                list.add(route1);
                list.add(route2);
                answer++;
            }
        }

        return answer;
    }
}