package day23;

public class Array_Warm_Up {
    public static void main(String[] args) {
        //create an array and print in in reverse order
        //find sum, find average, find max, find min
        //double the value of each item in this array
        int[] numbers = {5, 6, 8, 9, 10, 16, 95};
        for (int x = numbers.length - 1; x >= 0; x--) {
            System.out.println(numbers[x]);
        }
        System.out.println("--------------------------------------------------------------------------");
        //store last item in a variable called lastItem, print it out separately
        int arraySize = numbers.length;
        int lastItemIndex = arraySize - 1;
        int lastItemValue = numbers[lastItemIndex];
        System.out.println("lastItemValue = " + lastItemValue);
        System.out.println("------------------------------");

        //print the item right in the middle
        int middleItemIndex = arraySize/2;
        System.out.println("middleItemIndex = " + numbers[middleItemIndex]);
        System.out.println("------------------------------------------");

        int sum=0;
        for (int k = 0; k < arraySize; k++) {
            int currentItem = numbers[k];
            sum = sum + currentItem;
            // sum = sum + numbers[k]
            // sum += numbers[k]
        }
        System.out.println("sum = " + sum);

        int[] bills = {5, 6, 8, 9, 10, 16, 95};

        int max = bills[0];
        int min = bills[0];
        for (int b = 0; b < bills.length; b++) {
            if(bills[b]>max)
                max=bills[b];
            if(bills[b]<min)
                min=bills[b];
        }
        System.out.println("The largest bill is "+ max);
        System.out.println("The smallest bill is "+ min);
        }
    }


