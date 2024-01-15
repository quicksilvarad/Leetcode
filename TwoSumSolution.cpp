class TwoSumSolution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            int rem = target - nums[i];
            auto te = mp.find(rem);
            if(te == mp.end())
                mp[nums[i]] = i;
            else{
                return {te->second, i};
            }
        }
        return {};
    }
};