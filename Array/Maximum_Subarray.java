class Solution {
    public int maxSubArray(int[] nums) {

        int sum =0;
        int result = nums[0];

        for(int n : nums)
        {
            sum+=n;

            if(sum>result)
                result=sum;

            if(sum<0)
                sum=0;
        }

        return result;
    }
}
