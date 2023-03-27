class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int count = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].equals(" ")){
                count=0;
                continue;
            }
            if(count%2==0){ // 홀수번째 대문자로
                str[i] = str[i].toUpperCase();
                count++;
            }
            else{ // 짝수번째 소문자로
                str[i] = str[i].toLowerCase();
                count++;
            }
        }
        for(String a : str){
            answer+=a;
        }
        return answer;
    }
}