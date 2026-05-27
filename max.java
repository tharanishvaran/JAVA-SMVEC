import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size Of An Array : ");
        int n=sc.nextInt();
        int [] ar=new int[n];
        System.out.println("Enter the Values Of an Array : ");
        int max=ar[0];
        for(int i=1;i<n;i++)
        {
          ar[i]=sc.nextInt();
        } 
        for(int i=1;i<n;i++)
        {
          max=((ar[i]>max)?ar[i]:max);
        }
        System.out.println("Maximum Element in the Array is : "+max);

    }
}