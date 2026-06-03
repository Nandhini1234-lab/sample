class Animal {
    public void makeSound()
    {
        System.out.println("Animal sound");
    }
}
class cat extends Animal{
    //@override
    public void makeSound(){
        System.out.println("cat meowwww");
    }
}
public class Override{
    public static void main(String[]args)
    {
        cat C= new cat();
        C.makeSound();
    }
}