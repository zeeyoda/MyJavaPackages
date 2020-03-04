package day16;

public class Task_1_Five_Little_Monkeys {
    public static void main(String[] args) {
        int monkeyCount = 5;
        String name = "monkeys";
        String name2 = "monkey";
        while (monkeyCount > 0) {
            System.out.println(monkeyCount + " little monkeys jumping on the bed,");
            System.out.println("One fell down and bumped his head,");
            System.out.println("Mama called the doctor and the doctor said: ");

            if (monkeyCount > 1) {
                System.out.println("No more " + name + " jumping on the bed.");
            } else if (monkeyCount == 1) {
                System.out.println("No more " + name2 + " jumping on the bed.");
            }
            System.out.println(" ");
            --monkeyCount;
        }
        System.out.println("Put those monkeys right to bed!");
    }
}
