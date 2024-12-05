class Solution {
    public static int generateKey(int num1, int num2, int num3) {
        String first = helper(num1);
        String second = helper(num2);
        String third = helper(num3);

        return toNumber(first, second, third);
    }

    static String helper(int x){
        StringBuffer sb = new StringBuffer();
        sb.append(x);
        int count = (int)Math.log10(x) + 1;

        while(count < 4){
            sb.insert(0,'0');
            count++;
        }

        return sb.toString();

    }

    static int toNumber(String f, String s, String t){
        StringBuffer ans = new StringBuffer();

        for(int i = 0 ; i < 4 ; i++){
            int ch1 = Character.getNumericValue(f.charAt(i));
            int ch2 = Character.getNumericValue(s.charAt(i));
            int ch3 = Character.getNumericValue(t.charAt(i));

            ans.append(Math.min(ch1,Math.min(ch2,ch3)));
        }

        int i = 0;
        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }
        if (i == ans.length()) {
            return 0;
        }

        return Integer.parseInt(ans.substring(i));
    }
}