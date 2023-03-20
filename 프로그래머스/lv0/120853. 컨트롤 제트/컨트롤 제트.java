class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] ars = s.split(" ");
        String a = "Z";
        for(int i=0; i<ars.length; i++){
            if(ars[i].equals(a)){
                answer -= Integer.parseInt(ars[i-1]);
                continue;
            }
            answer += Integer.parseInt(ars[i]);
        }
        return answer;
    }
}