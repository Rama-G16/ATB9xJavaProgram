package Oct.ex_25102024_strings;

public class Lab120_string_created {
    public static void main(String[] args0){
        String name = "pramod"; //string constant pool
        //reference "name" points to promod
        name = "dutta";
        //reference "name" points to dutta,
        name = "pramoddutta";
        //reference "name" points to pramoddutta
        name = "pramod"; // SCP
        //reference name now points to pramod
        // pramod, dutta, pramoddutta always remains in string constant pool

        // String -> data type
        // name -> Ref
        // = -> assignment operator
        // "Pramod" - Literal(String)

        System.out.println(name);// the last one will be printed



        String name2 = new String("Pramod");// in the heap area one new area(memory) is created, its not part of SCP
        String name3 = new String("Pramod");//in the heap area(object area) one more new memory created
        String name4 = new String("Pramod");//in the heap area(object area) one more new memory created


    }
}
