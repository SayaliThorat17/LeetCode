class Solution {
    public int numJewelsInStones(String J, String S) {

        HashMap<Character,Character>map = new HashMap();

        for(char c: J.toCharArray())
            map.put(c,c);

        int Count=0;
        for(char c: S.toCharArray())
        {
            if(map.containsKey(c))
                Count++;
        }

        return Count;
    }
}
