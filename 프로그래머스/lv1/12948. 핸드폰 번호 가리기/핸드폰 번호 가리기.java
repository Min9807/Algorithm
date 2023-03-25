class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] ars = phone_number.split("");
        for(int i=0; i<phone_number.length()-4; i++){
            ars[i] = "*";
        }
        for(String a : ars){
            answer+=a;
        }
        return answer;
    }
}