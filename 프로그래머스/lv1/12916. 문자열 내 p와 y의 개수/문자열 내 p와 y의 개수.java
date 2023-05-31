class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        for(char c : s.toUpperCase().toCharArray()){
            if(c == 'P') p++;
            else if(c == 'Y') y++;
        }
        if(p!=y){
            return false;
        }
        return true;
    }
}