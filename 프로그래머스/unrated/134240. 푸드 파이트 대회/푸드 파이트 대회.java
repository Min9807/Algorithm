class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++){
            if(food[i] == 1) continue;
            
            else if(food[i] % 2 == 0){ // 짝수인 경우
                for(int j=0; j<food[i]/2; j++){
                    answer+= String.valueOf(i);
                }
            }
            
            else if(food[i] % 2 == 1){
                for(int j=0; j<food[i]/2; j++){
                    answer += String.valueOf(i);
                }
            }
        }
        
        
        StringBuffer sb = new StringBuffer(answer);
        String reversedStr = sb.reverse().toString();
        
        answer = answer + "0" + reversedStr;
        
        return answer;
    }
}