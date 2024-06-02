class Solution {
public:
    void reverseString(vector<char>& s) {
        reverseHelper(s, 0, s.size() - 1);
    }

private:
    void reverseHelper(vector<char>& s, int left, int right) {
        if (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            reverseHelper(s, left + 1, right - 1);
        }
    }
};