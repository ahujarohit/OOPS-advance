class Fruit {
    public void show() {
        System.out.println("show from Fruit");
    }

    public static void display() {
        System.out.println("static display from Fruit");
    }
}
class Apple extends Fruit {
    public void show() {
        System.out.println("show from Apple");
    }

    public static void display() {
        System.out.println("static display from Apple");
    }
}
class Mango extends Fruit {
    public void show() {
        System.out.println("show from Mango");
    }

    public static void display() {
        System.out.println("static display from Mango");
    }
}
class TestFruit {
    public static void main(String args[]) {
        Fruit obj1 = new Fruit();
        obj1.show();        //Fruit
        obj1.display();     //Fruit

        Mango obj2 = new Mango();
        obj2.show();        //Mango
        obj2.display();     //Mango

        Fruit obj3 = new Mango();
        obj3.show();        //Overriding - "Mango"
        obj3.display();     //Overhiding - "Fruit"

        Mango obj4 = new Mango();
        Fruit obj5 = obj4;
        obj5.show();        //Mango
        obj5.display();     //Fruit  

        Mango obj6 = new Mango();
        Fruit obj7 = obj6;
        if(obj7 instanceof Apple) {
            Apple obj8 = (Apple) obj7;
            obj8.show();
            obj8.display();
        }

        Fruit obj9 = new Fruit();
        if(obj9 instanceof Apple) {
            Apple obj10 = (Apple) obj9;
            obj10.show();
            obj10.display();
        }
    }
}

















