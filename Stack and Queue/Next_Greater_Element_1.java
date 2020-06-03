class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st =new Stack();
        HashMap<Integer,Integer> map = new HashMap();

        for(int i=0;i<nums2.length;i++)
        {
            while(!st.empty() && nums2[i]>st.peek())
                map.put(st.pop(),nums2[i]);

            st.push(nums2[i]);
        }

        int arr []=new int[nums1.length];

        for(int n=0;n < nums1.length;n++)
            arr[n]=map.getOrDefault(nums1[n],-1);

        return arr;
    }
}

//2nd Solution

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int ans[] =new int[nums1.length];
        HashMap<Integer,Integer>map=new HashMap();

        int x= nums2.length;

        if(x==0) return new int[0];

        map.put(nums2[x-1],-1);
        for(int i=0;i<(x-1);i++)
        {
            for(int j=i+1;j<x;j++)
            {
                if(nums2[j]>nums2[i])
                {
                    map.put(nums2[i],nums2[j]);
                    break;
                }
            }

            if(!map.containsKey(nums2[i]))
                map.put(nums2[i],-1);
        }


        for(int i=0;i<nums1.length;i++)
            ans[i]=map.get(nums1[i]);

        //ans[ans.length-1]=-1;

        return ans;

    }
}
