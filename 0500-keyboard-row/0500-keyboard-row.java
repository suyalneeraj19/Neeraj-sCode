class Solution {
    public String[] findWords(String[] words) {
        Map<Character , Integer> map=new HashMap<>();

        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";

        for(char ch:row1.toCharArray()) map.put(ch,1);
        for(char ch:row2.toCharArray()) map.put(ch,2);
        for(char ch:row3.toCharArray()) map.put(ch,3);

         List<String> result = new ArrayList<>();

        for (String word : words) {
            Set<Integer> row = new HashSet<>();
            for (char c : word.toLowerCase().toCharArray()) {
                // Add the row number of the character to the set
                if (map.containsKey(c)) {
                    row.add(map.get(c));
                }
            }

            // If all characters belong to the same row, add the word to the result
            if (row.size() == 1) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);

    }
}