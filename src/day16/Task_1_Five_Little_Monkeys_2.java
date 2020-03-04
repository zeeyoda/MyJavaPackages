package day16;

public class
Task_1_Five_Little_Monkeys_2 {
    public static void main(String[] args) {
        int monkeys = 5;
        while ( monkeys > 1) {
            System.out.println(monkeys + " little monkeys jumping on the bed,\n"
                    + "One fell down and bumped his head,\n"
                    + "Mama called the doctor and the doctor said,\n"
                    + "No more monkeys jumping on the bed!");
            System.out.println(" ");
            --monkeys;
            if (monkeys == 1) {
                System.out.println(" ");
                System.out.println(monkeys + " little monkey jumping on the bed,\n"
                        + "One fell down and bumped his head,\n"
                        + "Mama called the doctor and the doctor said,\n"
                        + "No more monkeys jumping on the bed!");
                --monkeys;
            }
            System.out.println("Put those monkeys right to bed!");
        }
    }
}
