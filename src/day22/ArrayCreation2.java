package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {

        int[] ages ;// we are declaring a variable
        ages = new int[]{37,25,8,33};// we are assigning a value in a different line
        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);

        for (int x = 0; x <ages.length; x++) {
            System.out.println( ages[x]);
        }
        int[] areaCode = {703, 300, 954, 665};
        //if you do it in above way: initialization and declaration must happen in one line
        for (int i = 0; i < areaCode.length; i++) {
            System.out.println(areaCode[i] + " ");

        }


    }
}
