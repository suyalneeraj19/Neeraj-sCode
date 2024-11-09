class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                // This means we have a long press
            } else {
                return false;
            }
            j++;
        }
        
        return i == name.length();
    }
}