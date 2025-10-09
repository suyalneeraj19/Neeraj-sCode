class Solution {
    public long minTime(int[] skill, int[] mana) {
        long [] f = new long [skill.length];

        for(int i = 0 ; i < mana.length ; i++){
            long t = 0 , max = 0;

            for(int j = 0 ; j < skill.length ; j++){

                max = Math.max(max , f[j] - t);

                t += (long)skill[j] * (long)mana[i];
                f[j] = t;
            }

            for(int j = 0 ; j < skill.length ; j++){
                f[j] += max;
            }
        }

        return f[f.length - 1];
    }
}