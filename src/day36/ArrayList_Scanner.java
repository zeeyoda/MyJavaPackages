package day36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums=new ArrayList<>();

        for (int i = 0; i <5 ; i++) {// filing array list with loop and Scanner
            nums.add(scan.nextInt());
        }
        System.out.println(nums);

        //find max.
        int max= nums.get(0);

        for (int i = 0; i <nums.size() ; i++) {
            if(nums.get(i)>max){
                max=nums.get(i);
            }
        }
        System.out.println("max = " + max);



        // find sum
        int sum = 0;

        for (int i = 0; i <nums.size() ; i++) {
            sum=sum+nums.get(i);

        }
        System.out.println("sum = " + sum);
    }
}
