package ziyodaPractice;

public class Repl_129 {
    public static void main(String[] args) {
        String[] arr = {"zero", "one", "two","three","four"};
        int count = 0;
        String wordsWithE = "";
        for (int x=0; x<arr.length; x++) {

            if (arr[x].contains("e")) {
                count++;
                wordsWithE = wordsWithE.concat(arr[x] + "");

            }
        }
            System.out.println(count);
            String[] fewValues = new String[count];
            //String[] fewValues = wordsWithE.split("");

        }
    }

