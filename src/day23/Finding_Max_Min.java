package day23;

public class Finding_Max_Min {
    public static void main(String[] args) {

    int[] bills = {5, 6, 8, 9, 10, 16, 95};

    int max = bills[0];
    int min = bills[0];
        for (int b = 0; b < bills.length; b++) {
            if(bills[b]>max)
                max = bills[b];
            if(bills[b]<min)
                min = bills[b];
        }
        System.out.println("The largest bill is for: "+max);
        System.out.println("The smallest bill is for: "+min);
        }
}
