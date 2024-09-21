import java.io.IOException;
class Base {
    private static int covert(String s) {
        return Integer.parseInt(s);
    }
    public Object getMessage() {
        return "hello world";
    }
    public static void main(String args[]) {
        System.out.println("Base");
    }
}
class Derived extends Base {
    public static int covert(String s) throws IOException {
        return Integer.parseInt(s);
    }
    public String getMessage() {
        return "hello world";
    }
    public static void main(String args[]) {
        System.out.println("Derived");
    }
}





