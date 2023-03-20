class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int a : array){
            str += String.valueOf(a);
        }
        String[] args = str.split("");
        for(String a: args){
            if(a.equals("7")){
                answer++;
            }
        }
        return answer;
    }
}