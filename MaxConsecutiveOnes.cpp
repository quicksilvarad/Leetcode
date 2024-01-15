class MaxConsecutiveOnesSolution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int x=0;
        int xmax=0;
        for(int i=0;i<nums.size() ;i++)
        {
            
            if(nums[i]==1){
                x++;
            if(x>xmax){
                xmax=x;
            }
            }
            
            else{
                x=0;
            }
        }
        
    return xmax;
    }
};