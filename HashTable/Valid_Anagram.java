class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        HashMap<Character,Integer>map=new HashMap();

        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        for(char c : t.toCharArray())
        {
            if(!map.containsKey(c))
                return false;

            if(map.get(c)<=0)
                return false;

            map.put(c,map.get(c)-1);
        }

        return true;
    }
}


//2nd Solution
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!= t.length())
            return false;

        int counter [] = new int[26];

        for(int i=0;i<s.length();i++)
        {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for(int n:counter)
        {
            if(n!=0)
                return false;
        }

        return true;
    }
}
