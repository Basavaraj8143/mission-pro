class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int []res=new int[k];
       PriorityQueue<Integer>queue=new PriorityQueue<>((a,b)->countMap.get(a)-countMap.get(b));
      for (int num : countMap.keySet()){
        queue.offer(num);
        if(queue.size()>k){
            queue.poll();
        }
       }
       for(int i=0;i<k;i++){
          res[i]=queue.poll();
       }
        return res;
    }
}