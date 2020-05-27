class Solution {
    public String reverseStr(String s, int k) {

        char [] arr = s.toCharArray();

        for(int i=0; i<arr.length ;i += 2*k)
        {
            int r=i;
            int j = Math.min(i+k-1,arr.length-1);
            while(r<j)
            {
                char temp = arr[r];
                arr[r++] = arr[j];
                arr[j--] = temp;
            }
        }

        return new String(arr);


    }
}

//2nd Similar faster solution - Swap function
class Solution {
    public String reverseStr(String s, int k) {

        char [] arr = s.toCharArray();

        for(int i=0; i<arr.length ;i += 2*k)
        {
            int r=i;
            int j = Math.min(i+k-1,arr.length-1);

            swap(r,j,arr);
        }

        return new String(arr);


    }

    public void swap(int r, int j, char [] arr)
    {
        while(r<j)
            {
                char temp = arr[r];
                arr[r] = arr[j];
                arr[j] = temp;
                r++;
                j--;
            }

    }
}
