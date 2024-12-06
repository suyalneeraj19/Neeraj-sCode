class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();

        for(int x : banned){
            set.add(x);
        }
        int count = 0;
        for(int i = 1 ; i <= n ; i++){
            if(!set.contains(i) && (maxSum - i) >= 0){
                    maxSum -= i;
                    count++;
            }
        }

        return count;
    }
}