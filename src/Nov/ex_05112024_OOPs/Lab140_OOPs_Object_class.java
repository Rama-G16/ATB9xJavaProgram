package Nov.ex_05112024_OOPs;

public class Lab140_OOPs_Object_class {
    public static void main(String[] args) {
        Cat c1= new Cat();
        c1.name = "rosey";
        c1.sleep();
        System.out.println(c1.name);
    }
}
//runner class is with in the same class
class Cat{
    String name;


    void sleep(){
        System.out.println("Sleeping");
    }
}