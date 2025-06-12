public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        int[] numbers = {2, 4, 6, 8, 10};
        for (int num : numbers) {
            System.out.println(num);
        }
        
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);            
        }

        System.out.println("処理を終了します");

        int t = 0;
        do {
            System.out.println("tの値は: " + t);
            t++;
        } while (t < 3);

        int s = 0;
        while (true) {
            s++;
            if (s > 10) {
                break;
            }
            System.out.println(s);
        }

        System.out.println("処理を終了します");

        int u = 0;
        while (true) {
            u++;
            if (u > 10) {
                break;
            }
            if (u % 2 == 1) {
                continue;
            }
            System.out.println(u);
        }

        System.out.println("処理を終了します");
    }
}    