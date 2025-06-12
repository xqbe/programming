public class Operator {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;
        System.out.println("加算: " + (a + b)); // 13
        System.out.println("割算: " + (a / b)); // 3
        System.out.println("余り: " + (a % b)); // 1

        double power = Math.pow(a, b); // 10の3乗 = 1000.0
        System.out.println("累乗: " + power);

        int x = 10;
        x += 5; // x = x + 5
        System.out.println("x += 5: " + x); // 15

        x *= 2; // x = x * 2
        System.out.println("x *= 2: " + x); // 30

        a = 10;
        b = 5;
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a == b: " + (a == b)); // false

        x = 15;
        System.out.println(10 < x && x < 20); // true
        System.out.println(!(x == 15)); // false

        a = 0b1100; // 12
        b = 0b1010; // 10

        System.out.println("a & b: " + Integer.toBinaryString(a & b)); // 0b1000
        System.out.println("a << 1: " + Integer.toBinaryString(a << 1)); // 0b11000
    }
}
