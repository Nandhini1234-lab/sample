
class Car1{
    String brand;
    String speed;
    public void drive(){
        System.out.println("Brand:" + brand+"Speed:" +speed);
    }
}
public class Car2{
    public static void main(String[] args){
        Car1 Car2=new Car1();
        Car2.brand="BMW";
        Car2.speed="100km/hr";
        System.out.println(Car2.brand);
        System.out.println(Car2.speed);
        Car2.drive();


    }
}