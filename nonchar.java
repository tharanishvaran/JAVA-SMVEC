public class nonchar {
    public static void main(String[] args) {
        String s="aabccdde";
        int count=0;
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
            if(count==0)
            {
              System.out.println(s.charAt(i));
              break;
            }
        }

        System.out.println("Method - 2");
        int [] frequency=new int[256];
        for(char c:s.toCharArray())
        {
            frequency[c]++;
        }
        for(char t:s.toCharArray())
        {
            if(frequency[t]==1)
            {
                System.out.println(t);
                break;
            }
        }

    }
}