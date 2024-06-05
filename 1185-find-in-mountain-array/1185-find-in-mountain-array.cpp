class Solution {
public:
    int findInMountainArray(int t, MountainArray& arr) {
        int peak = findpeak(arr);
        int firstTry = oabs(arr, t, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return oabs(arr, t, peak + 1, arr.length() - 1);
    }

    int findpeak(MountainArray& arr) {
        int s = 0;
        int e = arr.length() - 1;

        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr.get(m) > arr.get(m + 1)) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }

    int oabs(MountainArray& arr, int t, int s, int e) {
        bool isAsc = arr.get(s) < arr.get(e);

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr.get(m) == t) {
                return m;
            }

            if (isAsc) {
                if (t > arr.get(m)) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            } else {
                if (t < arr.get(m)) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
};