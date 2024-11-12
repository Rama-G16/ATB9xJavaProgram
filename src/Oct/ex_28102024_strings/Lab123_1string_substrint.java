package Oct.ex_28102024_strings;

public class Lab123_1string_substrint {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

       String s1 = "happy new year";
       String s2 = s1.substring(6,9);//count starts from 0, the ending value n-1
       String s3 = s1.substring(10,14);
        System.out.println(s2+' '+s3);
    }
}