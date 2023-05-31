class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(Long.toString(n));
        int[] answer = new int[sb.length()];
        sb.reverse();
        int idx = 0;
        
        for(String a : sb.toString().split("")){
            answer[idx] = Integer.parseInt(a);
            idx++;
        }
        return answer;
    }
}