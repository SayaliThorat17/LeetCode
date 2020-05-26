class Solution {
    public String longestWord(String[] words) {

        HashMap<String,String> map=new HashMap();

        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],words[i]);
        }
        String ans="";
        for(String s :words)
        {
            int flag=0;
            if(ans.length()<s.length() || ans.length()==s.length() && s.compareTo(ans)<0)
            {
                for(int i=1;i<=s.length()-1;i++)
                {
                    if(!map.containsKey(s.substring(0,i) ) )
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==0 )
                    ans=s;
            }
        }

        return ans;
    }
}
