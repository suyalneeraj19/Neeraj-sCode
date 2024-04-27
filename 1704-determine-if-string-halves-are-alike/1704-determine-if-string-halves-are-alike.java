class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
    int count1 = 0, count2 = 0;
    String vowels = "aAeEiIoOuU";

    for (int i = 0; i < len / 2; i++) {
        if (vowels.indexOf(s.charAt(i)) != -1) {
            count1++;
        }
        if (vowels.indexOf(s.charAt(i + len / 2)) != -1) {
            count2++;
        }
    }

    return count1 == count2;
    }
}