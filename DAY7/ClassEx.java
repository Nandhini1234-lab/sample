import java.util.Scanner;

class Student{
    String name;
    int age;
    public void disp(){
        System.out.println("Name:" + name+"Age:" +age);
    }
}
public class ClassEx{
    public static void main(String[] args){
        Student stud=new Student();
        stud.name="NANDHINI";
        stud.age=23;
        System.out.println(stud.name);
        System.out.println(stud.age);
        stud.disp();


    }
}