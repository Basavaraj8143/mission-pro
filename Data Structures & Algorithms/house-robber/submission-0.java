class Solution {
    public int rob(int[] nums) {
     int []dp=new int [nums.length];
     for(int i=0;i<nums.length;i++){
        dp[i]=-1;

     }
    return  win(nums,0,dp);
        
    }
    public int win(int []nums,int idx,int[]dp){
        if(idx>=nums.length)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int keep=nums[idx]+win(nums,idx+2,dp);
        int no=win(nums,idx+1,dp);
        dp[idx]=Math.max(keep,no);
        return dp[idx];
    }
}
