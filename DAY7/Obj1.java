class Student{
    String name;
    int age;
    //default constructor
    Student(){
        name="default";
        age=20;
    }
    //parameterized constructor
     Student(String n,int a){
        this.name=n;
        this.age=a;
        }
    Student(String n)
    {
         this.name=n;
         this.age=22;
    }
    public void display(){
       System.out.println("Name: "+name+" Age: "+age);
       }
}
public class Obj1{
   public static void main(String[]args){
Student Student1=new Student("Test1",20);
Student1.name="Test1";
Student1.age=20;
Student1.display();
}
}