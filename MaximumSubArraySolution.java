class MaxSubArraySolution {
    //KEDANE ALGORITHM
    
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int x=nums.length;
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
}