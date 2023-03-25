class Solution {
    public int[] solution(long n) {
        String[] num = String.valueOf(n).split(""); 
        int[] answer = new int[num.length];
        for(int i=0; i<num.length; i++){
            answer[i] = Integer.valueOf(num[num.length-i-1]);
        }
        return answer;
    }
}