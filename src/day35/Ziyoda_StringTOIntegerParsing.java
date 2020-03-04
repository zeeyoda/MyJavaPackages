package day35;

public class Ziyoda_StringTOIntegerParsing {
    public static void main(String[] args) {

        String strnum = "150";
        //converting String to int
        int num = Integer.parseInt(strnum);
        System.out.println("num is " + num);

        String emplID = "DI-9856";
        //  int id = Integer.parseInt(emplID.split("-")[1]);// this is direct way
        String[] empIDSplit = emplID.split("-");
        String idStr = empIDSplit[1];
        int id = Integer.parseInt(idStr);
        System.out.println("id + " + id);

        String pointer = "6574:GHT";
        int pInNum = Integer.parseInt(pointer.split(":")[0]);
        System.out.println(pInNum);

        String mixed = "DLFKHJ-4905-BIFG";
        int onlyNums = Integer.parseInt(mixed.split("-")[1]);
        System.out.println(onlyNums);

        String numLnum = "766:GJHU-945";
        int strSplit = Integer.parseInt(numLnum.split(":")[0]);
        int strSplit2 = Integer.parseInt(numLnum.split("-")[1]);
        System.out.println(strSplit+", "+strSplit2);

        String twoNumbers = "100, 600";
        // I want to add these 2 numbers
       String[] twoNumbersSplit = twoNumbers.split(",");
       String first = twoNumbersSplit[0];

       int firstN = Integer.parseInt(first);
        System.out.println(firstN);




    }
}
