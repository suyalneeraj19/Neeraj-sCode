class Solution {
    class Trie{
        Trie arr[]=new Trie[26];
        boolean eow=false;
        public Trie(){
          for(int i=0;i<26;i++){
              arr[i]=null;
          }
        }
    }
    public  Trie create(List<String>brr){
        Trie root=new Trie();
        for(int i=0;i<brr.size();i++){
            Trie temp=root;
            for(int j=0;j<brr.get(i).length();j++){
                if(temp.arr[brr.get(i).charAt(j)-'a']==null){
                    temp.arr[brr.get(i).charAt(j)-'a']=new Trie();
                }
                temp=temp.arr[brr.get(i).charAt(j)-'a'];
            }
            temp.eow=true;
        }
        return root;
    }
    public String find(Trie root,String str){
        Trie temp=root;
        StringBuilder str1=new StringBuilder("");
        for(int i=0;i<str.length();i++){
           if(temp.arr[str.charAt(i)-'a']==null){
               return "";
           }
           
           temp=temp.arr[str.charAt(i)-'a'];
           str1.append(str.charAt(i));
           if(temp.eow==true){
               return str1.toString();
           }
        }
        return str1.toString();
    }
    public String replaceWords(List<String> dictionary, String array) {
        String arr[]=array.split(" ");
        Trie root=create(dictionary);
        for(int i=0;i<arr.length;i++){
            String str=find(root,arr[i]);
                if(!str.equals("")){
                    arr[i]=str;
                }
            }
            StringBuilder ans=new StringBuilder("");
            for(int i=0;i<arr.length;i++){
                ans.append(arr[i]);
                if(i!=arr.length-1){
                    ans.append(" ");
                }
            }
            return ans.toString();
    }
}