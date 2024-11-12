package Oct.ex_28102024_strings;

public class Lab123_3string_delimiter_split {
    public static void main(String[] args) {
        String fruits = "apple,banana,cherry"; // delimeter = ,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);
        String colors ="pink,blue,red";
        String[] split_colors = colors.split(",");
        System.out.println(split_colors[0]);
        System.out.println(split_colors[1]);
        System.out.println(split_colors[2]);

        String fruits2 = "ABC-XYZ-QWE"; // delimeter = ,
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);
    }

}
