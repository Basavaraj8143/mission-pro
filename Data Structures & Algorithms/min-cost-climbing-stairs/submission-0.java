class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=Math.min( win(0,cost,dp),win(1,cost,dp));
         return ans;
    }
    public int win(int idx,int[]cost,int []dp){
        if(idx>=cost.length){
            return 0;

        }
        if(dp[idx]!=-1)return dp[idx];
        int step=cost[idx]+win(idx+1,cost,dp);
        int step2=cost[idx]+win(idx+2,cost,dp);
        dp[idx]=Math.min(step,step2);
        return dp[idx];
    }
}
