package day35;

public class StringToIntergerParsing {
    public static void main(String[] args) {

        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println(num);

        String empID = "FB-457";
        int id = Integer.parseInt(empID.split("-")[1]);
        System.out.println(id);

        String[] empIDSplit = empID.split("-");
        String idStr = empIDSplit[1];
        int id1 = Integer.parseInt(idStr);
        System.out.println(id1);

        //String called twoNumber

        String twoNumbers = "100, 600";
        // I want to add them and give result
        String[] twoNumberSplit = twoNumbers.split(", ");
        String num1 = twoNumberSplit[0];
        String num2 = twoNumberSplit[1];
        int part1 = Integer.parseInt(num1);
        int part2 = Integer.parseInt(num2);
        int sum = part1+part2;
        System.out.println(sum);




    }
}
