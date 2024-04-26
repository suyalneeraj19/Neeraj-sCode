class Solution {
    public int countMatches(List<List<String>> items, String Key, String Value) {
        int res = 0;

        for (int i = 0; i < items.size(); i++) {
            if (Key.equals("type") && items.get(i).get(0).equals(Value)) {
                res++;
            }
            if (Key.equals("color") && items.get(i).get(1).equals(Value)) {
                res++;
            }
            if (Key.equals("name") && items.get(i).get(2).equals(Value)) {
                res++;
            }
        }

        return res;
    }
}