class Solution {
    public boolean isPalindrome(String s) {

        s=s.replaceAll("[^A-Za-z\\d]+","").toLowerCase();

        return check(0,s.length()-1,s);
    }


    public boolean check(int i,int j, String y)
    {
        while(i<j)
        {
            if(y.charAt(i)==y.charAt(j))
                return check(++i,--j,y);
            else
                return false;
        }
        return true;
    }
}
