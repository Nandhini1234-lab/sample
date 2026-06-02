import java.util.Scanner;
class User{
    String name;
    String phone;
    String location;
    User(String name,String phone,String location){
        this.name=name;
        this.phone=phone;
        this.location=location;
    }
    public void basic(){
        System.out.println(name+" "+phone+" "+location);
    }
}
class FoodUser extends User{
    String favfood;
    FoodUser(String name,String phone,String location,String favfood){
      super(name,phone,location);
      this.favfood=favfood;
    }
}
    public static void UserDetails(){
        System.out.println("Name:"+name+ "Phn:"+phone+ "Location:"+location+" "Favorite Food:"+ favfood);
    
    }



public class Inherit{
    public static void main(String args[]){
       FoodUser user1=new FoodUser("foodie","987654321","chennai","briyani");
       user1.userDetails();
    
    }
    }