class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0)    return 0;
        
        int s=0,e=n-1;
        int s_max=0,e_max=0;
        int ans=0;
        
        while(s<e){
            if(height[s]<height[e]){
                if(height[s]>s_max) s_max=height[s];
                else ans+=s_max-height[s];
                s++;
            }else{
                if(height[e]>e_max) e_max=height[e];
                else ans+=e_max-height[e];
                e--;
            }
        }
        return ans;
    }
}