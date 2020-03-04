package tasks;

public class Task_Array_Second_Max {
    public static void main(String[] args) {
        float[] arr = {1.99f, .99f, 4.65f, 3.89f, 3.88f, 2.88f};
        float max = arr[0];
        for (float eachArr: arr) {
            if(eachArr>max){
                max=eachArr;
            }
        }
        System.out.println(max);
        System.out.println("-------------------------------------");
        float secondMax = arr[1];
        for (float eachArr : arr) {
            if(eachArr>secondMax && max != eachArr){
                secondMax=eachArr;
            }

        }
        System.out.println("The second max is: "+secondMax);

        System.out.println("------------------------------------");
        int[] slices = {8, 9, 7, 25, 65, -7,0,5};
        int max1 = slices[0];
        int secondMax1 = slices[0];
        for(int eachSlice: slices){
            if(eachSlice>max1){
                max1=eachSlice;
            }
        }
        System.out.println(max1);
        for (int eachSLice : slices){
            if(eachSLice<max1 && secondMax1<eachSLice){
                secondMax=eachSLice;
            }

        }
        System.out.println("secondSlice! "+secondMax1);
    }
}
