class Solution {
    public boolean canChange(String s, String t) {
        if(s.equals(t)){
            return true;
        }

        int l = 0, r = 0;

        for(int i = 0 ; i < s.length() ; i++){

            char curr = s.charAt(i);
            char ans  = t.charAt(i);

            if(curr == 'R'){
                if( l > 0){
                    return false;
                }
                r++;
            }

            if(ans == 'L'){
                if(r > 0){
                    return false;
                }
                l++;
            }

            if(ans == 'R'){
                if(r == 0){
                    return false;
                }
                r--;
            }

            if(curr == 'L'){
                if(l == 0){
                    return false;
                }
                l--;
            }
        }

        return l==0 && r==0;
    }
}