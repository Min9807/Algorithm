class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(i==0){
                if(n>=array[i]){
                    count = n-array[i];
                    answer = array[i];
                }
                else{
                    count = array[i] - n;
                    answer = array[i];
                }
            }
            if(n>array[i]){
                if(count>=n-array[i]){
                    count = n-array[i];
                    answer = array[i];
                }

            }
            else{
                if(count>array[i]-n){
                    count = array[i]-n;
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}