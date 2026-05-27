import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size Of An Array : ");
        int n=sc.nextInt();
        int [] ar=new int[n];
        System.out.println("Enter the Values Of an Array : ");
        for(int i=0;i<ar.length;i++)
        {
          ar[i]=sc.nextInt();
        } 
        int sum=0;
        for(int i:ar)
        {
          sum+=(i%2==0)?i:0;
        } 
        System.out.println("The Even Sum is "+sum);

        System.out.print("Array After Reversed Values : ");
        int [] qr=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
           qr[j++]=ar[i];
        }
        for(int i:qr)
        {
            System.out.print(i+" ");
        }
    }
}