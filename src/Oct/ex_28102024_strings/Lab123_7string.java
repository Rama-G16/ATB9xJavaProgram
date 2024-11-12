package Oct.ex_28102024_strings;

public class Lab123_7string {
    public static void main(String[] args) {
        String s9 = "Pramoddutta Pramoddutta";
        System.out.println(s9.replace("Pram","Prem"));
        //System.out.println(s9.replaceAll("p.a","great"));
        System.out.println(s9.replaceAll("d","z"));
        String s1 = "rama";
        System.out.println(s1.replace("a","z"));
        String text = "cat cat cat";
        System.out.println(text.replace("cat", "monkey"));
        System.out.println(text.replaceAll("cat", "dog")); // Outputs: dog dog dog
        System.out.println(text.replace("c.t", "monkey"));

        System.out.println(text.replaceAll("c.t", "dog"));








        String s10 = "Pramodduttaji";
        System.out.println(s10.startsWith("Pra"));
        System.out.println(s10.endsWith("ji"));
        System.out.println(s10.endsWith("zy"));



        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);
        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);


        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);
    }
}
