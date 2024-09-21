class OverloadingExample {
    public String getMessage() {
        return "hello world";
    }
    public Object getMessage(char c) {
        return "hello world once again";
    }
    public static void main(String args[]) {
        OverloadingExample obj = new OverloadingExample();
        System.out.println(obj.getMessage('c'));
    }
}