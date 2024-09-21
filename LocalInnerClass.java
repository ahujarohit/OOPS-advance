class LocalInnerClass {
    public void check() {
        class Abc {
            public void show() {
                System.out.println("show from Abc.");
            }
        }
        Abc a = new Abc();
        a.show();
    }   
    public static void main(String args[])  {
        LocalInnerClass obj1 = new LocalInnerClass();
        obj1.check();
    }
}