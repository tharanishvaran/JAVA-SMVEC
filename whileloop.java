public class whileloop {
    public static void main(String[] args) {
        int sum=0,i=1,n=20;
        System.out.println("While Loop");
        while(i<=20)
        {
            sum+=i;
            i++;
        }
        System.out.println("Sum is : "+sum);
        System.out.println("Do while Loop");
        i=0;
        sum=0;
        do{
           sum+=i;
           i++;
        }while(i<=20);
        System.out.println("Sum is : "+sum);
    }
}