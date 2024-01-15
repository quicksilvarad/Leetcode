class SubarraySumSolution {
    public int subarraySum(int[] nums, int k) 
    {
        int x=0;
        int num=0;
        int l=nums.length;
        for(int i=0; i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
              x=x+nums[j];
              if(x==k)
              {
               num++;
              }
            }
            x=0;
        }
        return num;
    }
}