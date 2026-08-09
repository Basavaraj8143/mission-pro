
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int sum=0;
         int i=0;
        for (int num:nums){
           
             int need=target-num;
             if(mp.containsKey(need)){
                return new int[]{mp.get(need),i};
             }
             mp.put(num,i);
             i++;
        }
        return new int[] {};
    }
}