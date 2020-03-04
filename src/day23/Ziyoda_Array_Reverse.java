package day23;

public class Ziyoda_Array_Reverse {
    public static void main(String[] args) {

        int[] keybox = new int[]{2, 7, 8, 9, 56, 87};
        for (int x=keybox.length-1; x>=0 ; x--) {
            System.out.print(keybox[x] + " ");

        }
        System.out.println("--------------------------------");
        //now i will find the last item value
        int arraySize=keybox.length;
        int lastItemIndex = arraySize-1;
        int lastItemValue = keybox[lastItemIndex];
        System.out.println("The last item value is: "+lastItemValue);
    }

}
