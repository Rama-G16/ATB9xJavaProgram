package Oct.ex_25102024_strings;

public class Lab121_string_immutable_example {
    public static void main(String[] args){
        String name = "pramod";// stores in the memory with the ref name
        System.out.println(name.toUpperCase());//stores in the memory in the different area
        // pramod -> PRAMOD
        System.out.println(name);
        String name1 = name.toUpperCase();
        System.out.println(name1);


    }
}
