class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j= n-1;
        int pos = nums1.length-1;

        while(j>=0)
        {
            if(i<0 || nums1[i]<nums2[j])
                nums1[pos--]=nums2[j--];
            else
                nums1[pos--]=nums1[i--];
        }
    }
}     

//Another Solution

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

       for(int i=nums1.length-1,j=0;j<n;j++,i--)
           nums1[i]=nums2[j];

        Arrays.sort(nums1);
    }
}
