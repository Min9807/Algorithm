class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for(char ch : s.toCharArray()){
            int k = ch + n;
            if(ch >= 65 && ch<=90){ // 대문자인 경우.
                if(k>90){
                    k -= 26;
                }
            } else if(ch >= 90 && ch <= 122){ // 소문자인 경우.
                if(k>122){
                    k -= 26;
                }
            } else{
                answer += " ";
                continue;
            }
            answer += String.valueOf((char)k);
        }
        return answer;
    }
}