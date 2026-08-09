class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(i,nums[i]);
        }
        HashSet<Integer>set=new HashSet<>();
        boolean dup=false;
        for (int value : mp.values()) {
    if (!set.add(value)) {
        dup= true;
        break;
    }
}

                  return dup;
    }
}