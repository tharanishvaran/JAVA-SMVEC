public class string {
    public static void main(String[] args) {
        String s="hello";
        s.concat("world");
        System.out.println(s);
        StringBuilder sb=new StringBuilder("hello");
        sb.append("world");
        System.out.println(sb);
    }
}