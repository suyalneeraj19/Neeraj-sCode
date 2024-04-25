class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> ans=new HashMap<>();
        
        for(int i=0;i<indices.length;i++){
            ans.put(indices[i],s.charAt(i));
        }
        
        Arrays.sort(indices);
        StringBuilder sb=new StringBuilder();
        for(int x:indices){
            sb.append(ans.get(x));
        }
        return sb.toString();
    }
}