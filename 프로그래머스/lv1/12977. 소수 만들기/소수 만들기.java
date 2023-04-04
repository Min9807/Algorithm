class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int a=0; a<nums.length-2; a++){
            for(int b=a+1; b<nums.length-1; b++){
                for(int c=b+1; c<nums.length; c++){
                    int k = nums[a] + nums[b] + nums[c];
                    if(findNum(k)){
                        answer++;
                    }
                }
            }
        }   

        return answer;
    }
    public static boolean findNum(int a){ // 소수 판별 함수
        for(int i=2; i<a; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    
}