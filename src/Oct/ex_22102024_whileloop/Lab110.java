package Oct.ex_22102024_whileloop;

public class Lab110 {
    public static void main(String[] args) {
        //        int a = 0;
//        while (a < 0)
//        {
//            System.out.println("Print" + a);
//            a++;
//        }

        int a = 0;
        do {
            System.out.println("Print" + a);
            a++;
        } while (a < 0);     //one time it will execute as condition is checked at the end
    }
}
