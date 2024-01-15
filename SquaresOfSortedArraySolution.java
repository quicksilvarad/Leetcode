class SquaresOfSortedArraysSolution {
    public int[] sortedSquares(int[] nums) {
        int[] numsqr = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            numsqr[i]=nums[i]*nums[i];
        }
        Arrays.sort(numsqr);
       return numsqr;
    }
}