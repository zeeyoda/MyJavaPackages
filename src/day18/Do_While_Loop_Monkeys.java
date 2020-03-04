package day18;

public class Do_While_Loop_Monkeys {
    public static void main(String[] args) {

        int x = 5;

        do {
            if (x <= 1 || x % 2 == 1) {
                System.out.println(x + " boy monkeys jumping on the bed\n" +
                        "One fell down and bumped his head\n" +
                        "Mama called the doctor and the doctor said\n" +
                        "No more monkeys on the bed.");
                System.out.println("----------------------------------");
            } else if (x <= 1 || x % 2 == 0) {
                System.out.println(x + " girl monkeys jumping on the bed\n" +
                        "One fell down and bumped her head\n" +
                        "Mama called the doctor and the doctor said\n" +
                        "No more monkeys on the bed.");
                System.out.println("----------------------------------");
            }
            --x;
        } while (x >=1);

        System.out.println("Put those monkeys right to bed");
    }
}

