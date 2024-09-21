class DefaultValueInstance {
    protected String[] c;

    public DefaultValueInstance() {
        c = new String[10];     
        //  for(int i = 0; i < c.length; i++)
        //      c[i] = new String();    //second -- elements
        
    }
    public static void main(String args[]) {
        DefaultValueInstance obj = new DefaultValueInstance();
        System.out.println(obj.c[0]);
        System.out.println(obj.c[0].length());
        
    }
}