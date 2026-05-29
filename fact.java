public class fact {
    public static void main(String[] args) {
        int fact=1;
        for(int i=1;i<=5;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    
    //star
    System.out.println("Column");
    int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
    int sum=0;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
          sum+=ar[j][i];
        }
        System.out.println(sum);
        sum=0;
    }
}
}