class Solution {

    boolean [] ans = new boolean [10000+1];
    public List<Integer> selfDividingNumbers(int left, int right) {
        for(int i=1 ; i< ans.length; i++){
            ans[i] = isSelfDividing(i);
        }

        List<Integer> list = new ArrayList<>();

        for(int i = left ; i <= right ; i++){
            if(ans[i]){
                list.add(i);
            }
        }

        return list;

    }

    public static boolean isSelfDividing(int number) {
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            if (digit == 0 || originalNumber % digit != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}