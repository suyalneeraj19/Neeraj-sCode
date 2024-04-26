class Solution {
   public boolean checkPalindromeFormation(String a, String b) {
        return helper(a,b)||helper(b,a);
    }
    private boolean helper(String a,String b){
        int l=0,r=a.length()-1;
        while(l<r){
            if(a.charAt(l)!=b.charAt(r))
                break;
            
            l++;
            r--;
        }
        return helper(a,l,r)||helper(b,l,r);
    }

    private boolean helper(String a,int l,int r){
        while(l<r){
            if(a.charAt(l)!=a.charAt(r))
                break;
            l++;
            r--;
        }
        return l>=r;
    }
}