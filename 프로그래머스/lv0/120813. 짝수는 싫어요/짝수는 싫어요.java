class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        for(int i=1; i<n+1; i++){
            if(i%2!=0){
                count++;
            }
        }
        answer = new int[count];
        for(int i=1, j=0; i<n+1; i++){
            if(i%2!=0){
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}