class Solution {
    public boolean solution(String s) {
        if(s.length()!=4 && s.length()!=6){
            return false;
        }
        boolean answer = true;
        String[] ars = s.split("");
        
        for(String a : ars){
            if(a.charAt(0) >= 65 && a.charAt(0)<=90 || a.charAt(0) >=97 && a.charAt(0) <=122){
                return false;
            }
        }
        return answer;
    }
}