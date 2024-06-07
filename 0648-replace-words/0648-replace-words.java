class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        // Sort the dictionary in ascending order of word length
        Collections.sort(dictionary, (a, b) -> a.length() - b.length());
        
        // Split the sentence into individual words
        String[] words = sentence.split(" ");
        
        // Replace words with their root words
        for (int i = 0; i < words.length; i++) {
            for (String root : dictionary) {
                if (words[i].startsWith(root)) {
                    words[i] = root;
                    break;
                }
            }
        }
        
        // Join the modified words back into a sentence
        return String.join(" ", words);
    }
}