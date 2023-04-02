class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        answer[0] = -1;
        
        for(int i=1; i<len; i++){
            for(int j=0; j<i; j++){
                if(s.charAt(i) == s.charAt(j)){
                    answer[i] = i-j;
                }
            }
            if(answer[i] == 0){
                answer[i] = -1;
            }
        }
        
        
        return answer;
    }
}