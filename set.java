import java.util.*;
public class set {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        int [] ar={1,2,3,11,2,3};
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(!hs.contains(ar[i]))
            {
                hs.add(ar[i]);
                count++;
            }
            else
            {
                System.out.print(ar[i]+" ");
            }
        }
        System.out.println("\nCount is "+count);

    }
}