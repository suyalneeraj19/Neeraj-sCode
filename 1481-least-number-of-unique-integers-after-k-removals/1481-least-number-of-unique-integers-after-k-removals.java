class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        var map=new HashMap<Integer,Integer>();
        
        for(var x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        var count=new int[map.size()];
        int i=0;
        
        for(var x:map.values()){
            count[i++]=x;
        }
        
        Arrays.sort(count);
        
        for(i=0;i<count.length;i++){
            if(k<count[i])  break;
            k-=count[i];
        }
        
        return count.length-i;
    }
}