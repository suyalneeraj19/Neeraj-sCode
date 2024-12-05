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

    for (int i = 0; i < 4; i++) {
        int ch1 = Character.getNumericValue(f.charAt(i));
        int ch2 = Character.getNumericValue(s.charAt(i));
        int ch3 = Character.getNumericValue(t.charAt(i));

        ans.append(Math.min(ch1, Math.min(ch2, ch3)));
    }

    // Convert StringBuffer to String and remove leading zeros
    String resultString = ans.toString().replaceFirst("^0+(?!$)", "");

    // If resultString is empty after removing leading zeros, return 0
    if (resultString.isEmpty()) {
        return 0;
    }

    return Integer.parseInt(resultString);
    }
}