import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        List<String> number = new ArrayList<>();
        List<String> x = new ArrayList<>();
        

        String[] str = polynomial.split(" \\+ ");
        
        for(int i=0; i<str.length; i++){
            if(str[i].contains("x")){
                x.add(str[i]);
            }
            else{
                number.add(str[i]);
            }
        }
        
        int num = 0;
        for(String a : number){
            num += Integer.parseInt(a);
        }
        
        int xNum = 0;
        for(String a : x){
            if(a.equals("x")){
                xNum += 1;
                continue;
            }
            
            String[] sp = a.split("x");
            xNum += Integer.parseInt(sp[0]);
        }

        String answerX = "";
        if(xNum==1){
            answerX = "x";
        }
        else if(xNum==0){
            return String.valueOf(num);
        }
        else{
            answerX= xNum+"x";
        }
        
        if(num == 0){
            answer = answerX;
        }
        else{
            answer = answerX + " + " + String.valueOf(num);
        }
        return answer;
    }
}