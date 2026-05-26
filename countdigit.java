public class countdigit {
    public static void main(String[] args) {
         int n=1001,count=0;
         int digits=0,sum=0;
         while(n>0)
         {
            digits=n%10;
            sum+=digits;
            n=n/10;
            count++;
         }
         System.out.println("Count is : "+count);
         System.out.println("Sum Of Digits is : "+sum);
         n=1000;
         String s=Integer.toString(n);
         System.out.println(s.length());

    }
}