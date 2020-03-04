package day23;

public class Ziyoda_Practice_Array {
    public static void main(String[] args) {
        int[] number = {8, 7, 5, 65, 12, 2, 0};
        int itemCount = number.length;
        int lastItem = number[number.length-1];
        int middleItem = number[number.length/2];
        int sum = 0;
        int max = 0;
        int min = 0;
          for (int x=number.length-1; x>=0; x--){
              System.out.print(number[x]+" ");
              if(number[x]>max){
                  max=number[x];
                  }
              if(number[x]<min){
                  min=number[x];
              }
            sum = sum + number[x];
        }
        System.out.println();
        System.out.println(lastItem);
        System.out.println(middleItem);
        System.out.println(sum);
        System.out.println(sum/number.length);
        System.out.println(max);
        System.out.println(min);
    }
}
