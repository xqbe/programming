import java.util.Scanner;

public class ShippingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("税抜価格を入力してください: ");
        double taxExcludedPrice = scanner.nextDouble();

        double taxRate = 0.10;
        double taxIncludedPrice = taxExcludedPrice * (1 + taxRate);

        int shippingCost;
        if (taxIncludedPrice >= 2000) {
            shippingCost = 0;
            System.out.println("送料は無料です");
        } else {
            shippingCost = 350;
            System.out.printf("送料は%d円です%n", shippingCost);
        }

        double totalPrice = taxIncludedPrice + shippingCost;

        System.out.printf("送料込税込価格は%.0f円です%n", totalPrice);
    }
}
