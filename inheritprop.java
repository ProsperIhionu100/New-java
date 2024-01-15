class Vehicle{
    private String carName;
    // private int age;
    public String getName(){ 
        return carName;
    }
    
    public Vehicle(String carName){
        this.carName = carName;
    }
    void engine(){
        System.out.println("My car has an engine "+ carName);
    }
}
class Car extends Vehicle{
    private String carName;
    private int wheels;

    public Car(String carName, int wheels){
        super(carName);
        this.wheels = wheels;
    } 
    public int getwheel(){
        return wheels;
    }
    
    // void engine(){
    //     System.out.println("This car does not have an engine");
    // }
    void carBreak(){
        System.out.println("This car has a break");
    }
}




public class inheritprop {
    public static void main(String[] args) {
        Car vc = new Car("Benz", 4);
        Vehicle v = new Car("Toyota", 3);
        v.engine();
        //(Car) v.myname1();
        System.out.println(vc.getwheel()); 
    }
}
