public class BOY {
    // The three instance variables (start)
    private String name;
    private int age;
    private String marital_status;
    // (stop)

    // A getter for all the instance variables (start)    
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getMarital(){
        return marital_status;
    }
    // (stop)

    // The constructor that intializies the three instance variables
    public BOY(String name, int age, String marital_status){
            this.name = name;
            this.age = age;
            this.marital_status = marital_status;
    }
    
    public void setmarital(String M){
        this.marital_status = M;
    }

}
// This is the demo class
class BoyDemo{
    public static void main(String[] args) {
        BOY boy = new BOY("Femi", 10, "single");
        // The marital Status of the Object Changed
        boy.setmarital("Married");
        // The details of the object printed
        System.out.println(boy.getName());
        System.out.println(boy.getMarital());
        System.out.println(boy.getAge());

    }
    
}