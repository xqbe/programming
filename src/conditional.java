import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("点数を入力してください: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("優秀です");
            System.out.println("大変よくできました！");
        } else if (score >= 60) {
            System.out.println("合格です");
            System.out.println("おめでとうございます！");
        } else {
            System.out.println("不合格です");
            System.out.println("もっとがんばりましょう");
        }

        System.out.println("処理を終了します");
        scanner.close();

        String result = ( score >= 60) ? "合格" : "不合格";
        System.out.println(result);

        int grade = 2;

        switch (grade) {
            case 1:
                System.out.println("1年生です");
                break;
            case 2:
                System.out.println("2年生です");
                break;
            case 3:
                System.out.println("3年生です");
                break;
            default:
                System.out.println("該当なし");
        }
        
        int grades = 4;
        String message = switch (grades) {
            case 1 -> "1年生です";
            case 2 -> "2年生です";
            case 3 -> "3年生です";
            default -> "該当なし";
        };
        System.out.println(message);
    
    }
}

