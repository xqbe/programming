import java.util.Scanner;


public class Exception2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        boolean success = false;

        try {
            System.out.println("整数を入力してください");
            int num = Integer.parseInt(scanner.nextLine());
            result = 100 / num;
            success = true;
        } catch (ArithmeticException e) {
            System.out.println("エラー: 0で割ることはできません");
        } catch (NumberFormatException e) {
            System.out.println("エラー: 整数を入力してください");
        } finally {
            scanner.close();
            if (success) {
                System.out.println("計算結果: " + result);
            }
            System.out.println("プログラム終了");
        }
    }
}