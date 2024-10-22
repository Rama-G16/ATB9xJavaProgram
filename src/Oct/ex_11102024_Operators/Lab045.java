package Oct.ex_11102024_Operators;

public class Lab045 {
    public static void main(String[] args) {
        //logical operators
        // !, && , ||   not, and , or
        // &&   TT- T, TF-F, FT-F, FF-F
        // ||   TT-T, TF-T, FT-T, FF-F
        boolean a = true;
        boolean b = true;
        boolean c= true || false;
        boolean d= true && false;
        System.out.println(c);
        System.out.println(!a);
        System.out.println(!!b);
        System.out.println(!!!b);
        System.out.println(!!!!b);
        System.out.println(d);
    }
}
