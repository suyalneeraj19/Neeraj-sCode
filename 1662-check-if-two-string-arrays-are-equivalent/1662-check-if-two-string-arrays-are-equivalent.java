class Solution {
    public boolean arrayStringsAreEqual(String[] s, String[] p) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        
        for(String x:s)
            sb1.append(x);
        
        for(String y:p)
            sb2.append(y);
        
        return (sb1.toString().equals(sb2.toString()));
            
    }
}