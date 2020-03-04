package day18;

public class CountOfMonkey_Do_While {
    public static void main(String[] args) {

        int countOfMonkey = 5;
        do {
            if (countOfMonkey == 4 || countOfMonkey == 2) {
                System.out.println(countOfMonkey + " - girl-bumped her head,\n" +
                        "No more monkeys jumping on the bed!");
            } else if (countOfMonkey == 5 || countOfMonkey == 3) {
                System.out.println(countOfMonkey + "- boy - bumped his head,\n" +
                        "No more monkeys jumping on the bed!");
            } else {
                System.out.println(countOfMonkey +
                        "- boy - bumped his head,\n" +
                        "No more monkeys jumping on the bed!");
              }
            --countOfMonkey;

           } while (countOfMonkey >= 1);
        System.out.println("Put those monkeys right to bed! ");

    }
}

