package Nov.ex_06112024_OOPs_constructor;

public class Car {
    String model;
    int year;
    String name;

    //Default constructor : no return type,no arg, same name as class name
    Car() {
        name = "Unknown Name";
        model = "XYZ";
        year = 0;
        System.out.println("DC is executed!");
    }
}
