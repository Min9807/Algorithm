class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] ars = s.split("");
        if(ars[0].equals("-")){
            String number ="";
            for(int i=1; i<ars.length; i++){
                number += ars[i];
            }
            return Integer.parseInt(number) * -1;
            
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}