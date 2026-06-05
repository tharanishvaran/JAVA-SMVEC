import java.util.*;
public class sample {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int [] b={3,4,5,6,7};
        HashSet<Integer> hs=new HashSet<>();
        for(int c:a)
        {
            hs.add(c);
        }
        for(int d:b)
        {
            if(hs.contains(d))
            {
                System.out.print(d+" ");
            }
        }

    }
}