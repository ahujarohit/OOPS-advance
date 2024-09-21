interface Ia {
    void a();
}
interface Ib {
    void b();
}
interface Ic extends Ia, Ib {
    void c();
}
abstract class Cc implements Ic {
    @Override
    public void a() {
        System.out.println("A");
    }
}
class DerivedCc extends Cc {
    @Override
    public void b() {
        System.out.println("B");
    }
    @Override
    public void c() {
        System.out.println("C");
    }

    public static void main(String args[]) {
        Ia obj = new DerivedCc();
        System.out.println(obj instanceof Ia);
        System.out.println(obj instanceof Ib);
        System.out.println(obj instanceof Ic);
        System.out.println(obj instanceof Cc);
        System.out.println(obj instanceof DerivedCc);
        System.out.println(obj instanceof TestFruit);
        
        
    }
}
// Cc is a Cc
// Cc is a Ic
// Cc is a Ia
// Cc is a Ib

// DerivedCc is a Cc
// DerivedCc is a Ic
// DerivedCc is a Ia
// DerivedCc is a Ib
// Derived is a Derived







