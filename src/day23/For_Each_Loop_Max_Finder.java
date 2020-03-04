package day23;

public class For_Each_Loop_Max_Finder {
    public static void main(String[] args) {
        //use for each loop to find the max
        //use for each loop to find the min


        // I need to pick up an item from this array and compare with other items
        //since first item comes first I decided to pick up the first item
        //and make it temporarily the max value
        long[] salaries = {105000, 150000, 160000, 125000, 145000, 130000};
        long max = salaries[0];
        long min = salaries[0];
        for (int index = 0; index <salaries.length ; index++) {
            System.out.println(salaries[index] + " ");
            if (salaries[index] > max)
            max = salaries[index];
            if (salaries[index] < min)
            min = salaries[index];
        }
        System.out.println("the maximum salary is "+ max);
        System.out.println("the minimum salary is "+ min);

        }
    }

