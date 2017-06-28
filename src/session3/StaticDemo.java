package session3;

public class StaticDemo {
	private String name;
    private static String staticStr = "STATIC-STRING";
     
    public StaticDemo(String n){
        this.name = n;
    }
     
    public static void testStaticMethod(){
        System.out.println("Hey I am inside static method...");
        //static variables are accessed inside static methods
        System.out.println(StaticDemo.staticStr);
        //you can not call instance variables here.
    }
     
    public void nonStaticMethod(){
        System.out.println("Hey i am in non-static method");
        //static variables can be accessed in non static method
        System.out.println(StaticDemo.staticStr);
        //you can call instance variables here
        System.out.println("Name: "+this.name);
    }
     
    public static void main(String a[]){
        //By using class name, you can call static method
    	StaticDemo.testStaticMethod();
    	StaticDemo staticdemo = new StaticDemo("Sudhir");
    	staticdemo.nonStaticMethod();
    }

}
