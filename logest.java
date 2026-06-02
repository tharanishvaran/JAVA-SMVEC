public class logest {
    public static void main(String[] args) {
        String s="Java is Powerful";
        int count=0,max=0;
        for(int i=0;i<s.length();i++)
        {
           while( (i<s.length()) && s.charAt(i)!=' ')
           {
            count++;
            i++;
           }
           max=(count>max)?count:max;
           count=0;
        }
        System.out.println("The Max word is : "+max);
    }
}