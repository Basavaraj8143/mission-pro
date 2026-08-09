class Solution {
    public boolean canJump(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i>max){
                return false;
            }
            max=Math.max(nums[i]+i,max);
            if(max>=nums.length-1)return true;

        }
        return true;
    }
}
