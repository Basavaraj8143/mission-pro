class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b)->(a[0]-b[0]));
        List<int[]>list=new ArrayList<>();
        int start=inter[0][0];
        int end=inter[0][1];
        for(int i=1;i<inter.length;i++){
            int s=inter[i][0];
            int l=inter[i][1];
            if(s<=end){
                end=Math.max(l,end);
            }else{
               list.add(new int[]{start,end});
               start=s;
               end=l;
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}
