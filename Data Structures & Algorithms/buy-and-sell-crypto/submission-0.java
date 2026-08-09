class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=0;
        int min=Integer.MAX_VALUE;
        int pr=0;
        int maxpr=0;
       for(int i=0;i<prices.length;i++){
        min=Math.min(min,prices[i]);
        pr=prices[i]-min;
        maxpr=Math.max(pr,maxpr);
       }
        return maxpr;
    }
}
