public class Datatype {
    public static void main(String[] args) {
       int a = 10;
       int b = -5;
       int c = 0;
       System.out.println(a + b); // 5
       
       System.out.println(10 / 3); // 3
       System.out.println(10 / 3.0); // 3.3333....

       double x = 3.14;
       double y = 0.1 + 0.2;
       System.out.println(y); // 0.30000000000000004（浮動小数点誤差）

       int i = (int) 3.99; // 3
       double d = (double) 10; // 10.0

       String text = "Hello, World!";
       System.out.println(text);

       System.err.println("Hi!".repeat(3)); // Hi! Hi! Hi!

       System.out.println("Hello".length());

       String text2 = "Java";
       System.out.println(text2.toUpperCase()); // 'JAVA'
       System.out.println(text2.toLowerCase()); // 'java'

       int aa = 5;
       int bb = 10;
       System.out.println(aa < bb); // true
       System.out.println(aa == bb); // false

       String name = null;
       System.out.println(name); // null
    }
}
