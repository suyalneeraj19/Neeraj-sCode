class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        int i=0,j=0;
        while(i<words1.length && j<words2.length){
            if(!words1[i].equals(words2[j]))    break;
            i++;
            j++;
        }
        if(i==words1.length || j==words2.length) return true;
        int l1=words1.length-1,l2=words2.length-1;

        while(l1>=i && l2 >=j){
            if(!words1[l1].equals(words2[l2]))  return false;
            l1--;
            l2--;
        }

        return l1<i|| l2<j;
    }
}