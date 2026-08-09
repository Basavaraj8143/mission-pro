class Solution {
    public int climbStairs(int n) {
        int []dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        return stair(n,0,dp);

        
    }
    public int stair(int n,int idx,int[]dp){
        if(idx==n)return 1;
        if(idx>n)return 0;
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int min=stair(n,idx+1,dp);
        int min2=stair(n,idx+2,dp);
    
    dp[idx]=min+min2;
    return dp[idx];
}
}
