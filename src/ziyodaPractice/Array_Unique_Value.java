package ziyodaPractice;

public class Array_Unique_Value {
    public static void main(String[] args) {
        int[] a = {45, 75, 25, 36, 45, 65, 89, 75, 65};
        for (int i = 0; i < a.length ; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                }

            }
            if(count == 1){
                System.out.println(a[i]);
            }

        }
    }
}
