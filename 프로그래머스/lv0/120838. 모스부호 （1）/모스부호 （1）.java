class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        String[] ars = letter.split(" ");
        for(int i =0;i<ars.length; i++){
            for(int j=0; j<morse.length; j++){
                if(morse[j].equals(ars[i])){
                    answer += String.valueOf((char)(97+j));
                    break;
                }
            }
        }
        return answer;
    }
}