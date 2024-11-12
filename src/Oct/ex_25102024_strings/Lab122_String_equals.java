package Oct.ex_25102024_strings;

public class Lab122_String_equals {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP
        String s4 = "Hello"; // SCP
        String s10 = "Hello"; // SCP all the ref points to same string
// total no of strings 1 in SCP, "Hello"

        String s2 = new String("Hello"); // OA new string
        String s3 = new String("Hello"); //OA new string
        String s5 = new String("hello");
        // new always creates a new memory in object area


        // == -> comparsion

        System.out.println();
    }
}
