public class method {
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public void change(int x)
    {
        x=500;
        System.out.println("x is "+x);
    }
    public static int[] array(int [] ar)
    {
        int i=0,j=0;
        int [] arr=new int[ar.length]; 
        for(i=ar.length-1;i>=0;i--)
        {
            arr[j++]=ar[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        int x=10;
        method m=new method();
        m.change(x);
        System.out.println("After Change Function x is :"+x);
        int [] ar={1,2,3,4,5};
        int [] arr=array(ar);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }
}