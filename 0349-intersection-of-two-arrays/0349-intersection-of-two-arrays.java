class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        
        for(int x:nums1){
            s1.add(x);
        }
        
        for(int x:nums2){
            if(s1.contains(x)){
                s2.add(x);
            }
        }
        
        int [] ans=new int[s2.size()];
        int k=0;
        for(int x:s2){
            ans[k++]=x;
        }
        
        return ans;
        
    }
}