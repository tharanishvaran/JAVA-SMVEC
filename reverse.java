public class reverse {
    public static void main(String[] args) {
        int digits=0,rev=0,n=321;//   123
         while(n>0)
         {
            digits=n%10;//1,2,3
            rev=rev*10+digits;//0+1=1, 10+2=12 ,12*10=120+3=123
            n=n/10;//n=32  ,3
         }
         System.out.println("Reverse is : "+rev);
         
    }
}