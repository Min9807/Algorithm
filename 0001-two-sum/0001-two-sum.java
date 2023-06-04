class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        for(i=0; i<nums.length-1; i++){
            int sum = 0;
            boolean check = false;
            for(j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    check = true;
                    break;
                }
            }
            if(check){
                break;
            }
        }

        return new int[]{i, j};
    }
}