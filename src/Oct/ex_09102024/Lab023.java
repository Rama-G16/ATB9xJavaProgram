package Oct.ex_09102024;

public class Lab023 {
    int instance_variable = 10; // Instance Variable
    static int static_variable = 10; // Static Varible

    public static void main(String[] args) {
        int age = 10; // Local Variable


        {
            int sachin = 10;
            System.out.println(sachin);
        }
       // System.out.println(sachin); --not recognised sachin variable
        System.out.println(age);
       // System.out.println(instance_variable);--not recognised
        System.out.println(static_variable);
    }
}
