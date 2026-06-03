import java.util.Scanner;
public class exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length : ");
        int n=sc.nextInt();
        int [] ar=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int j=1;j<n;j++)
        {
            System.out.print(ar[j]-ar[j-1]+" ");
        }

    }
}