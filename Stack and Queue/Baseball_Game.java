class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> st = new Stack();

        int sum=0;
        for(String s : ops)
        {
            if(s.equals("+"))
            {
                int x=st.pop();

                int y= st.peek();

                st.push(x);
                sum+=(x+y);
                st.push(x+y);
            }
            else if(s.equals("D"))
            {
                    sum+=(2*st.peek());
                    st.push(2*st.peek());
            }
            else if(s.equals("C"))
            {
                    sum-=st.pop();
            }
            else
            {
                int y = Integer.parseInt(s);
                st.push(y);
                sum+=y;
            }
        }

        return sum;
    }
}
