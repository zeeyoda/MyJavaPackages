package day26;

import java.util.Arrays;

public class Array_Swapping_Values {
    public static void main(String[] args) {
        //swap the first item value with last item value
        String name1 = "Emma";
        String name2 = "Jason";

        // name2 should have Emma, name1 should have Jason


        String tempContainer = name1;
        name1 = name2;
        name2 = tempContainer;

        System.out.println("name1 = "+ name1);
        System.out.println("name2 = "+ name2);

        int[]myNumbers = new int[]{10, 40, 30, 7};
        int temp = myNumbers[0];
        myNumbers[0]=myNumbers[3];
        myNumbers[3]=temp;

        System.out.println(Arrays.toString(myNumbers));

        int temp2 = myNumbers[1];
        myNumbers[1]=myNumbers[2];
        myNumbers[2]=temp2;
        System.out.println(Arrays.toString(myNumbers));
    }
}
