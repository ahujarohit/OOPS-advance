class Abc {                         //Abc.class
    public class Xyz {              //Abc$Xyz.class
        public void show() {
            System.out.println("show from Xyz.");
        }
    }
    public void check() {
        //Creating an object of Member Inner Class within Outer Class
        Xyz obj = new Xyz();
        obj.show();
    }
}
class MemberInnerClass {            //MemberInnerClass.class
    public static void main(String args[]) {
        Abc a = new Abc();
        //Creating an object of Member Inner Class within Outside Outer Class
        Abc.Xyz b = a.new Xyz();
        b.show();
        //Creating an object of Member Inner Class within Outside Outer Class
        Abc.Xyz c = new Abc().new Xyz();
        c.show();
    }
}









