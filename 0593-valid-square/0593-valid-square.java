class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> res=new HashSet<>();
        res.add(side(p1,p3));
        res.add(side(p1,p2));
        res.add(side(p1,p4));
        res.add(side(p2,p4));
        res.add(side(p3,p4));
        res.add(side(p3,p2));

        return (!res.contains(0) && res.size()==2);
    }

    static int side(int [] a,int [] b){
        return (int)(Math.pow(b[0]-a[0],2)+Math.pow(b[1]-a[1],2));
    }
}