package Oct.ex_22102024_whileloop;

public class Lab107 {
    public static void main(String[] args) {
        // Two Ways
        // 1 Arguments
        // 2. Scanner Class
        // 3. BufferReader - R

        // Take a User input for the age and print the output.
        // 30 , 30, 29, 28.....1

        String a = args[0];
        // String -> Int
        int age = Integer.parseInt(a);
        //System.out.println(age);

        while (age > 0) {
            System.out.println(age);
            age--;
        }
    }
}
