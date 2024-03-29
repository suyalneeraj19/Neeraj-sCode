class Solution {
    public int countSpecialNumbers(int n) {
        
    // Convert n to a list of digits
    List<Integer> digits = new ArrayList<>();
    for (int i = n + 1; i > 0; i /= 10) {
        digits.add(0, i % 10);
    }

    int len = digits.size();
    int count = 0;

    // Count the number of non-repeated digits numbers with length less than len
    for (int i = 1; i < len; i++) {
        count += 9 * perm(9, i - 1); // 9 choices for the first digit, 9 choices for the rest
    }

    // Count the number of non-repeated digits numbers with length equal to len
    Set<Integer> seen = new HashSet<>();
    for (int i = 0; i < len; i++) {
        for (int j = i > 0 ? 0 : 1; j < digits.get(i); j++) {
            if (!seen.contains(j)) {
                count += perm(9 - i, len - i - 1); // Choices for the remaining digits
            }
        }
        if (seen.contains(digits.get(i))) break;
        seen.add(digits.get(i));
    }

    return count;
}

private int perm(int n, int k) {
    int result = 1;
    for (int i = 0; i < k; i++) {
        result *= n - i;
    }
    return result;
}
}