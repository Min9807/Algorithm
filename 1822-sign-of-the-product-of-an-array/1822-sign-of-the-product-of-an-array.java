class Solution {
    public int arraySign(int[] nums) {
        int k = 1;
        for(int num : nums){
            if(num > 0){
                k *= 1;
            }else if(num<0){
                k *= -1;
            }else{
                k *= 0;
            }
        }

        if(k>0){
            return 1;
        }else if(k<0){
            return -1;
        }
        return 0;
    }
}