class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        int []res=new int [n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int last=stack.pop();
                res[last]=i-last;
            }
            stack.push(i);
       

        }
        return res;
    }
}
