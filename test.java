class student{
    private String name;
    private int age;
    private int salary;
    public void set(String name,int age,int salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void get()
    {
        System.out.println("Iam "+name+" Age is "+age+" Salary is "+salary);
    }

}
public class test {
    public static void main(String[] args) {
        student s=new student();
        s.set("Tharanish",21,100000);
        s.get();

    }
}