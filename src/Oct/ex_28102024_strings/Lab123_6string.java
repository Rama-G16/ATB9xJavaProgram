package Oct.ex_28102024_strings;

public class Lab123_6string {
    public static void main(String[] args) {
        String s6 = "Pramod";
        System.out.println(s6.indexOf("r"));//count starts from 0
        System.out.println(s6.indexOf("d"));

        String s7 = "Pramod";
        System.out.println(s7.contains("ra"));//checks the sub string exist or not
        System.out.println(s7.contains("zy"));

        String s8 = "Pramoddutta";
        System.out.println(s8.lastIndexOf("d")); //if two same letters together

    }
}
