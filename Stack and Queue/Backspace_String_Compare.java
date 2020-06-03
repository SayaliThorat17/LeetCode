class Solution {
    public boolean backspaceCompare(String S, String T) {

        Stack<Character> st = new Stack();
        Stack<Character> rs = new Stack();

        for(char c : S.toCharArray() )
        {
            if(c=='#')
            {
                if(!st.empty())
                    st.pop();
            }
            else
                st.push(c);
        }

        for(char c : T.toCharArray() )
        {
            if(c=='#')
            {
                if(!rs.empty())
                    rs.pop();
            }
            else
                rs.push(c);
        }

        String a ="",b="";
        for(char c:st)
            a+=c;

        for(char c:rs)
            b+=c;

        return a.equals(b);
    }
}


//2nd Solution
class Solution {
    public boolean backspaceCompare(String S, String T) {

        return func(S).equals(func(T));
    }

    public String func (String S)
    {
        Stack<Character> st = new Stack();

        for(char c : S.toCharArray() )
        {
            if(c=='#')
            {
                if(!st.empty())
                    st.pop();
            }
            else
                st.push(c);
        }

        return String.valueOf(st);
    }
}
