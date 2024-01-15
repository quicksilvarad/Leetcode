class FindNumsWithEvenDigitsSolution {
    public int findNumbers(int[] nums) {
        
        int l=0;
        for(int i=0; i<nums.length;i++)
        {
            String s = Integer.toString(nums[i]);
            int x = s.length();
            
            if(x%2==0)
            {
                l++;
            }
        }
    
        return l;
    
    }
}