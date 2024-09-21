class Abc {                             //Abc.class
    static class Xyz {                  //Abc$Xyz.class
        public void show() {
            System.out.println("show from Xyz");
        }
        public static void display() {
            System.out.println("static display from Xyz");
        }
        public static int X = 100;
    }
    public void check() {
        //Creating an object of static inner class within outer class
        Xyz obj = new Xyz();
        obj.show();
        Xyz.display();
        System.out.println(Xyz.X);
    }
}
class StaticInnerClass {
    public static void main(String args[]) {
        //Creating an object of static inner class outside outer class
        Abc.Xyz obj = new Abc.Xyz();
        obj.show();
        Abc.Xyz.display();
        System.out.println("X : " + Abc.Xyz.X);
    }
}









