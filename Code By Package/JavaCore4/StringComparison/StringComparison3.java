package JavaCore4.StringComparison;

public class StringComparison3 {

    public static void main(String[] args) {

        String password1 = "rony";
        String password2 = "Rony";
        String password3 = new String("Rony");
        String password4 = new String("Rony");
        String password5 = new String("Rony123");

        System.out.println(password1.equalsIgnoreCase(password2));      //ignoring letter/alphabet case
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
        System.out.println(password3.equals(password5));

    }

}
