package day35;

public class Wrapper_Parse {
    public static void main(String[] args) {

        float f6 = Float.parseFloat("3.14f");
        System.out.println(f6);


        String sentence = "I bought 3 tomato and the price was 3.14 each";
        // how much is your tomato purchase
        String[] sentSplit = sentence.split(" ");
        int count = Integer.parseInt(sentSplit[2]);
        double price = Double.parseDouble (sentSplit[sentSplit.length-2]);

       System.out.println("Total price is "+count*price);


        /*String twoNumbers = "100, 600";
        // I want to add them and give result
        String[] twoNumberSplit = twoNumbers.split(", ");
        String num1 = twoNumberSplit[0];
        String num2 = twoNumberSplit[1];
        int part1 = Integer.parseInt(num1);
        int part2 = Integer.parseInt(num2);
        int sum = part1+part2;
        System.out.println(sum);*/
    }

}
