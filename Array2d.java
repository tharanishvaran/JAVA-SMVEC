import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.print("Enter the Row Size of an Array :");
        m=sc.nextInt();
        System.out.print("Enter the Column Size of an Array :");
        n=sc.nextInt();
        int [][] ar=new int[m][n];
        System.out.println("Enter the Array Values : \n");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Array Values are \n");
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                //System.out.print(ar[i][j]+"\t");
                sum+=ar[i][j];
            }
            System.out.println();
            System.out.println((i+1)+" row sum is"+sum);
            sum=0;
        }
        System.out.println("\nArray Diagonal Values are \n");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print((i==j)?ar[i][j]:"");
            }
            System.out.println("");
        }
        System.out.println("\nArray Values Except Middle are \n");
        int midi=m/2,midj=n/2;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print((i!=midi || j!=midj)?ar[i][j]:" ");
            }
        }
    }
}