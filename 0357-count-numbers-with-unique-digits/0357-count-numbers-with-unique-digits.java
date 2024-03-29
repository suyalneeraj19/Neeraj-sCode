class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        // add base condition
        if(n==0)    return 1;
//         let p,q  be 9(they store the running product)  to use in the permutation formaula
        int p=9,q=9,r=n;
//         apply the permutation formula
        while(n-->1)
            p*=q--;
            return p+countNumbersWithUniqueDigits(r-1);
        
        
    }
}