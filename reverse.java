public class reverse{
    public static void main(String[] args) {
        String s="Java is Easy";
        String [] num=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=num.length-1;i>=0;i--)
        {
           sb.append(num[i]);
           sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}