class ContainsDuplicationSolution {
public:
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int x = nums.size();
        int a[100000];
        for(int i=0; i<x-1; i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
    return false;}
};