class Solution {
    public String solution(String my_string) {
        String answer = my_string.replace("a", "");
        String answer1 = answer.replace("e", "");
        String answer2 = answer1.replace("i", "");
        String answer3 = answer2.replace("o", "");
        String answer4 = answer3.replace("u", "");
        
        return answer4;
    }
}