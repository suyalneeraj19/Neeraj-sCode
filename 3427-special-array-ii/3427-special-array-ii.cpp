class Solution {
public:
    vector<bool> isArraySpecial(vector<int>& nums, vector<vector<int>>& queries) {
        int n = nums.size();
        int m = queries.size();
        if(n == 1)
        {
            vector<bool> ans(m, true);
            return ans;
        }
        vector<bool> ans(m);
        vector<int> temp(n);
        temp[0] = 0;
        int value = 0;
        for(int i=1;i<n;i++)
        {
            value += (nums[i-1] % 2 == nums[i] % 2);
            temp[i] = value;
        }
        for(auto num : temp) cout << num << " ";
        cout << endl;
        // 1 for diff same, 0 for diff
        int i = 0;
        for(auto query : queries)
        {
            int first =query[0];
            int second = query[1];
            cout << first << " " << second << endl;
            ans[i] = (temp[first] == temp[second]) ? true : false;
            i++;
        }
        return ans;
    }
};