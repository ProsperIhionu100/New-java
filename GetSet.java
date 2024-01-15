public class GetSet {
    
    private String name;

    private int age ;

    public String getName(){ 
        return name;
    }
    public int getage(){
        return age;
    }

    public void setName(String N, int A){
        this.age = A;
        this.name = N;

    }
    public static void main(String[] args) {
        GetSet obj = new GetSet();

        obj.setName("Munirat", 2);

        System.out.println(obj.getName()); 
        System.out.println(obj.getage());
    }

}


