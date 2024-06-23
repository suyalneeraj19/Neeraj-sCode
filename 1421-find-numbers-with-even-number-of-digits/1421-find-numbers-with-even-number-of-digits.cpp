class Solution {
public:
    int findNumbers(std::vector<int>& nums) {
        int count = 0;
        for (int x : nums) {
            if (isEven(x)) {
                count++;
            }
        }
        return count;
    }

    bool isEven(int num) {
        int numberOfDigits = nod(num);

        return (numberOfDigits % 2 == 0);
    }

    int nod(int num) {
        if (num < 0)
            num *= -1;

        return (int) std::log10(num) + 1;
    }
};

