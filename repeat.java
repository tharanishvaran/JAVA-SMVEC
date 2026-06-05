import java.util.*;
public class repeat {
    public static void main(String[] args) {
        HashSet<Character> hs=new HashSet<>();
        HashSet<Character> dp=new HashSet<>();
        String s="banana";
        for(int i=0;i<s.length();i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                dp.add(s.charAt(i));
            }
            hs.add(s.charAt(i));
        }
        for(char c:dp)
        {
            System.out.print(c+" ");
        }

    }
}