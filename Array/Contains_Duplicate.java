class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
}   //Using sorting



//Another Solution using hashtable
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap();

        for(int n : nums)
        {
            if(map.containsKey(n))
                return true;

            map.put(n,n);
        }
        return false;
    }
}
