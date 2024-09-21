class Abc {                         //Abc.class
    public void show() {
        System.out.println("show form Abc.");
    }
    public void display() {
        System.out.println("display form Abc.");
    }
}
class AnonymousInnerClass {     //AnonymousInnerClass.class
    public static void main(String args[]) {
        Abc obj = new Abc();
        obj.show();
        obj.display();

        Abc obj1 = new Abc() {      //AnonymousInnerClass$1.class
            @Override
            public void show() {
                System.out.println("overridden show");
                check();
            }
            public void check() {
                System.out.println("check");
            }
        };
        obj1.show();
        obj1.display();
        // obj1.check();

        new Abc() {             //AnonymousInnerClass$2.class
            @Override
            public void show() {
                System.out.println("another show");
            }
        }.show();
    }
}















