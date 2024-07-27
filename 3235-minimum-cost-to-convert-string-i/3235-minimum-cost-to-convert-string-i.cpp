class Solution {
public:
    long minimumCost(string source, string target, vector<char>& original, vector<char>& changed, vector<int>& cost) {
        long arr[26][26];
        for (int i = 0; i < 26; i++) {
            fill(arr[i], arr[i] + 26, LONG_MAX);
            arr[i][i] = 0;
        }
        
        for (int i = 0; i < original.size(); i++) {
            int val1 = original[i] - 'a';
            int val2 = changed[i] - 'a';
            arr[val1][val2] = min(arr[val1][val2], (long)cost[i]);
        }
        
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    arr[j][k] = min(arr[j][k], arr[j][i] + arr[i][k]);
                }
            }
        }
        
        long ans = 0;
        for (int i = 0; i < source.size(); i++) {
            int val1 = source[i] - 'a';
            int val2 = target[i] - 'a';

            if (val1 == val2) {
                continue;
            }

            if (arr[val1][val2] == LONG_MAX) {
                return -1;
            } else {
                ans += arr[val1][val2];
            }
        }
        return ans;
    }
};