class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] answer = new String[len];
        
        for(int i=0; i<len; i++){
            String[] str = quiz[i].split(" ");
            if(str[1].equals("+")){
                if(Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4])){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }else{
                if(Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4])){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
            
        }
        return answer;
    }
}