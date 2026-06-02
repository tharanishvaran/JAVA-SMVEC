class user{
    String name;
    String phone;
    String location;
    user(String name,String phone,String location)
    {
        this.name=name;
        this.phone=phone;
        this.location=location;
    }
    public void details()
    {
        System.out.println("name "+name+" phone number "+phone+" location "+location);
    }
}
class fooduser extends user{
    String favfood;
    fooduser(String name,String phone,String location,String favfood)
    {
        super(name,phone,location);
        this.favfood=favfood;
    }
    public void userdetails()
    {
        System.out.println("name "+name+" phone number "+phone+" location "+location+" fav food "+favfood);
    }
}
class area extends fooduser
{
    String areas;
    area(String name,String phone,String location,String favfood,String areas)
    {
        super(name,phone,location,favfood);
        this.areas=areas;
    }
    public void areauser()
    {
        System.out.println("name "+name+" phone number "+phone+" location "+location+" fav food "+favfood+" area "+areas);
    }

}
public class inheritance {
    public static void main(String[] args) {
        //user s=new user("tharanish","9994421390","siruvanthadu");
        //s.details();
        fooduser fu=new fooduser("tharanish","9994421390","siruvanthadu","biriyani");
        //fu.userdetails();
        area a=new area("tharanish","9994421390","siruvanthadu","biriyani","chennai");
        a.areauser();
        
    }
}