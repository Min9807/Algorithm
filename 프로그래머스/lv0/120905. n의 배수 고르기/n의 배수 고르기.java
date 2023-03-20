class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int count = 0;
        for(int num : numlist){
            if(num%n==0){
                count++;
            }
        }
        answer = new int[count];
        int i = 0;
        for(int num : numlist){
            if(num%n==0){
                answer[i] = num;
                i++;
            }
            
        }
        return answer;
    }
}