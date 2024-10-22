package Oct.ex_10102024_constants_literals;

public class Lab034 {
    public static void main(String[] args) {
        // Binary Literal
        int age = 65; // Decimal System - Y, base will be 10

        // Binary Literal
        int binary_num = 0b1010;

        // Octal base? -> 8
        int octal = 0101; // 0101 = (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) = 65

        // Hexadecimal Literals
        int hex = 0Xface; //base 16 color combination are in hex - #28a745
        System.out.println(binary_num);
        System.out.println(age);
        System.out.println(octal);
        System.out.println(hex);

    }

}
