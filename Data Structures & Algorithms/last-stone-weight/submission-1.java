class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            queue.offer(stones[i]);
        }
        while(queue.size()>1){
            int s1=queue.poll();
            int s2=queue.poll();
            queue.offer(s1-s2);
        }
return queue.isEmpty() ? 0 : queue.poll();
    }
}
