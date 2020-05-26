class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer>map=new HashMap();

        for(int n:nums1)
            map.put(n,1);

        HashMap<Integer,Integer>map1=new HashMap();
        for(int n :nums2)
        {
            if(map.containsKey(n))
                map1.put(n,1);
        }

        int arr[] =new int[map1.size()];

        for(int n=0,j=0;j<map1.size();n++)
        {
            if(map1.containsKey(nums2[n]) && map1.get(nums2[n])!=0)
            {
                arr[j]=nums2[n];
                j++;
                map1.put(nums2[n],0);
            }
        }

        return arr;
    }
}   //HashMap

//2nd Solution - HashSets
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

    HashSet<Integer> set1 = new HashSet<Integer>();

    for (Integer n : nums1)
        set1.add(n);

    HashSet<Integer> set2 = new HashSet<Integer>();

    for (Integer n : nums2)
        set2.add(n);

    set1.retainAll(set2);

    int [] output = new int[set1.size()];
    int idx = 0;

    for (int s : set1)
        output[idx++] = s;

    return output;
    }
}
