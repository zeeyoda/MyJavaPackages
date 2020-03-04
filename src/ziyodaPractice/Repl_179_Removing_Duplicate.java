package ziyodaPractice;

public class Repl_179_Removing_Duplicate {
    public static void main(String[] args) {
        String str = "java";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

                if (!result.contains(str.substring(i, i+1))) {
                    result += str.substring(i, i + 1);

                    }
                }

        System.out.println(result);


    }
}
