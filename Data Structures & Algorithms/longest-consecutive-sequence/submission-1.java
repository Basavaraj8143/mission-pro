class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);

        }
        int maxlen=0;
        int len=1;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
            int curr=nums[i];
            while(set.contains(curr+1)){
                len++;
                curr++;
            }
            maxlen=Math.max(len,maxlen);
           len=1;
        }
        }
        return maxlen;
    }
}
