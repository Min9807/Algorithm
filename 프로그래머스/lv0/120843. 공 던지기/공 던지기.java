class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<k-1; i++){
            count +=2;
            if(count>=numbers.length){
                count = count-numbers.length;
            }
            answer=numbers[count];
            
        }
        return answer;
    }
}