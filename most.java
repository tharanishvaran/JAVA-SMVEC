public class most {
    public static void main(String[] args) {
        String s="aaaaabbbbbbb";
        int count,max=0;
        char c=' ';
        for(int i=0;i<s.length();i++)
        {
            count=0;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j && (s.charAt(i)==s.charAt(j)))
                {
                    count++;
                }
            }
            if(count>max)
            {
                c=s.charAt(i);
                max=count;
            }
        }
        System.out.println(c);
    }
}