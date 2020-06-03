class Solution {
    public boolean isValid(String s) {

        HashMap<Character,Character>map=new HashMap();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        Stack<Character> st = new Stack();

        for(char c : s.toCharArray())
        {
            if (c=='{' || c=='[' || c=='(')
                st.push(c);
            else if(st.isEmpty() || st.pop()!=map.get(c))
                return false;
        }

        return st.isEmpty();
    }
}
