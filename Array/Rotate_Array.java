class Solution {
    public void rotate(int[] nums, int k) {

        if(k>nums.length-1)
            k=k%nums.length;

        reverse(0,nums.length-1,nums);
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);
    }

    public void reverse(int start,int end,int [] arr)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}       //Reversing Array SOlution

//Another Solution 

class Solution {
    public void rotate(int[] nums, int k) {

        HashMap <Integer,Integer> map=new HashMap();

        for(int i=0, j=0;i<nums.length;i++)
        {
            j = (i+k)%nums.length;

            map.put(j,nums[i]);
        }

        for(int i=0;i<nums.length;i++)
            nums[i]=map.get(i);
    }
}
