import java.util.Scanner;
public class palindrome {
    public boolean palindrom(String s)
    {
      int len=s.length(),low=0,high=len-1;
      while(low<high)
      {
        if(s.charAt(low++)!=s.charAt(high--))
            return false;
      }
      return true;
    }
    public static void main(String[] args) 
    {  
      Scanner sc=new Scanner(System.in);
      String n,nn;
      System.out.println("Enter The String ");
      n=sc.nextLine();
      System.out.println("Enter The  second String ");
      nn=sc.nextLine();
      palindrome p=new palindrome();
      System.out.println(p.palindrom(n));
      System.out.println(p.palindrom(nn));
    }
}