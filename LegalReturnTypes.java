//primitive (void, primitive, implicit type casting), 
// reference (reference, null, implicit type casting),
// array (array, null, implicit type casting),

class LegalReturnTypes {
    //incase no return type - void (primitive)
    public void sayMessage() {
        System.out.println("hello world");
    }

    //you can return any primitive data type from a function
    public int getX() {
        return 10;
    }

    //you can return any primitive data type from a function (implicit type casting)
    public char getChar() {
        return 65;
    }

    //you can return reference type from a function
    public String getMessage() {
        return "hello world";
    }

    //you can return null value for areference type from a function
    public String getMessage1() {
        return null;
    }

    //you can return reference type from a function (implicit type casting)
    public Object getMessage2() {
        return "hello world";
    }

    //you can return an array from a function
    public int[] getMarks() {
        int marks[] = {10, 11, 12, 13};
        return marks;
    }

    //you can return null value for an array from a function 
    public int[] getMarks1() {
        return null;
    }

    //you can return an array from a function (implicit type casting)
    public Object getMarks2() {
        int marks[] = {10, 11, 12, 13};
        return marks;
    }

}










