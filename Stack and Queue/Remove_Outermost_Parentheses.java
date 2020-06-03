class Solution {
    public String removeOuterParentheses(String S) {

       StringBuilder a = new StringBuilder();

        int i=0;
        for(char c : S.toCharArray())
        {
            if(c=='(' && (i+=1)>1)
            {
                    a.append(c);
            }
            else if(c ==')' && (i-=1)>0)
            {
                    a.append(c);
            }
        }

        return a.toString();
    }
}
