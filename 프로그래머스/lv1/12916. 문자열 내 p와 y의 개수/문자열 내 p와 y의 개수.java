class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        String[] ars = s.split("");
        int countP = 0;
        int countY = 0;
        for(String a : ars){
            if(a.equals("P")){
                countP++;
            }
            else if(a.equals("Y")){
                countY++;
            }
        }
        
        if(countP!=countY){
            answer=false;
        }

        return answer;
    }
}