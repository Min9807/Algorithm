class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");
        for(int a : indices){
            str[a] = "";
        }
        for(String a : str){
            answer += a;
        }
        return answer;
    }
}