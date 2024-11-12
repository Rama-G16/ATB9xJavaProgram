package Oct.ex_25102024_strings;
import java.lang.String;
public class Lab119_length_of_the_string {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);
        char d = '2';
        System.out.println(d);

        String name1 = "rama";
        int length = name1.length();
        System.out.println(length);
        System.out.println(name1.length());
// length returns the number of characters in the string

        String name =  "Pramod";
        // Returns the length of this string.
        // The length is equal to the number of Unicode code units in the string
        System.out.println(name.length()); // 6


    }
}
