class MaxSubarraySolution {
public:
    int maxSubArray(vector<int>& nums) {
      int max=INT_MIN;
        int x=nums.size();
        int sum=0;
        for (int i=0;i<x;i++)
        {
            
            sum=sum+nums[i];
            //System.out.println(sum);
               
                if(sum>max)
                {
                    max=sum;
                    
                }
                if(sum<0)
                {
                    sum=0;
                 }
                }
        
    return max;   
    }
};