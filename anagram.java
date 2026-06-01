import java.util.*;
public class anagram {
    public boolean anagrams(String one,String two)
    {
        HashSet<Character>hs=new HashSet<>();
        if(one.length()!=two.length())
          return false;
        for(char c:one.toCharArray())
        {
            hs.add(c);
        }
        for(char d:two.toCharArray())
        {
            if(!hs.contains(d))
               return false;
        }
        return true;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String first,second;
      System.out.println("Enter The String ");
      first=sc.nextLine();
      System.out.println("Enter The  second String ");
      second=sc.nextLine();
      anagram p=new anagram();
      System.out.println(p.anagrams(first,second));
      

    }
}