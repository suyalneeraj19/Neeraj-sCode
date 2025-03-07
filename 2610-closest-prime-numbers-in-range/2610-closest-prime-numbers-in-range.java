class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> sieve = new ArrayList<>();

        if(left == 1){
            left = 2;
        }

        for(int i = left ; i <= right ; i++){
            if(isSieve(i)){
                sieve.add(i);
            }
        }
        int diff = Integer.MAX_VALUE;
        
        int a = -1 , b = -1;
        for(int i = 0 ; i < sieve.size()-1 ; i++){
            if(sieve.get(i+1) - sieve.get(i) < diff){
                a = sieve.get(i);
                b = sieve.get(i+1);
                diff = b - a;
            }
        }

        return new int [] {a,b};
    }

    static boolean isSieve(int n){
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0)  return false;
        }
        return true;
    }
}