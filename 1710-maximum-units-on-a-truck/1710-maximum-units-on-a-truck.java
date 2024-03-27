class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       PriorityQueue<int []> ans=new PriorityQueue<>((a,b)->b[1]-a[1]);
       ans.addAll(Arrays.asList(boxTypes));
        
       int max=0;
       while(!ans.isEmpty() && truckSize>0){
           int [] box=ans.poll();
           int add=Math.min(box[0],truckSize);
           max+=add*box[1];
           truckSize-=add;
       }
    return max;
    }
}