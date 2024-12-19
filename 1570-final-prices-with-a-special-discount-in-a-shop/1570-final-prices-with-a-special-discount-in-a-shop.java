class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        
        st.push(n - 1);
        nge[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && prices[st.peek()] > prices[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                nge[i] = st.peek();
            } else {
                nge[i] = -1;
            }
            st.push(i);
        }
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nge[i] == -1) {
                ans[i] = prices[i];
            } else {
                ans[i] = prices[i] - prices[nge[i]];
            }
        }
        return ans;
    }
}