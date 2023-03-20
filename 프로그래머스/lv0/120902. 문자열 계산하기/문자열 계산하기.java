class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String exp = my_string.replaceAll("- ", "+ -");
        String[] ars = exp.split(" \\+ ");
        for(String a : ars){
            answer += Integer.parseInt(a);
        }
        return answer;
    }
}