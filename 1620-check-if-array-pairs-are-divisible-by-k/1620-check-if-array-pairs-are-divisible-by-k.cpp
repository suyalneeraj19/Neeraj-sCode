class Solution {
public:
    bool canArrange(std::vector<int>& arr, int k) {
        std::vector<int> count(k, 0);

        for (int x : arr) {
            x %= k;
            if (x < 0)
                x += k;
            count[x]++;
        }

        if (count[0] % 2 != 0)
            return false;

        for (int i = 1; i <= k / 2; i++) {
            if (count[i] != count[k - i]) {
                return false;
            }
        }
        return true;
    }
};