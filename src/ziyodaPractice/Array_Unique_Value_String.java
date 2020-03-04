package ziyodaPractice;

public class Array_Unique_Value_String {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "B", "A"};

        for (int x = 0; x < array.length; x++) {

            int count = 0; // to store the number of appearance
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(array[x])) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(array[x]);
            }

        }
    }}
