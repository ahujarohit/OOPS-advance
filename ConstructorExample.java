class Base {
    protected int b;
    public Base() {                     //4
            System.out.println("Default Constructor - Base");
    }
    public Base(int b) {                //3              
        this();
        this.b = b;
        System.out.println("Para. Constructor - Base");
    }
}
class Derived extends Base {
    protected int d;
    public Derived() {                  //2
            super(10);
            System.out.println("Default Constructor - Derived");
    }
    public Derived(int d) {             //1              
        this();
        this.d = d;
        System.out.println("Para. Constructor - Derived");
    }
}
class ConstructorExample {
    public static void main(String args[]) {
        Derived obj = new Derived(10);
    }
}






















