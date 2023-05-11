class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] str = dartResult.split("");
        int count = -1;
        int[] score = new int[3];
        
        for(int i=0; i<str.length; i++){
            // 어떤 숫자인지 파악
            if(str[i].matches("[0-9]")){
                count++;
                
                score[count] = Integer.parseInt(str[i]);
                if(str[i+1].matches("[0-9]")){
                    score[count] = 10;
                    i++;
                }
            }
            
            
            switch(str[i]){
                case "D":
                    score[count] = score[count] * score[count];
                    break;
                    
                case "T":
                    score[count] = score[count] * score[count] * score[count];
                    break;
                    
                case "*":
                    if(count != 0){
                        score[count-1] = score[count-1] * 2;
                    }
                    score[count] = score[count] * 2;
                    break;
                    
                case "#":
                    score[count] *= -1;
                    break; 
            }
        }
        
        for(int a : score){
            answer += a;
        }
        
        return answer;
    }
}