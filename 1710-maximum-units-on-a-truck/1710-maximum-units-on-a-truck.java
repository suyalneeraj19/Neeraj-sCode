class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       Arrays.sort(boxTypes, Comparator.comparingInt(o -> -o[1]));
		int max = 0, i = 0, n = boxTypes.length;
		while (i < n && truckSize > 0) {
			int innermax = Math.min(boxTypes[i][0], truckSize);
			max += innermax * boxTypes[i][1];
			i++;
			truckSize -= innermax;
		}
		return max; 
    }
}