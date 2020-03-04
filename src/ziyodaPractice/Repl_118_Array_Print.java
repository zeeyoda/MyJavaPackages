package ziyodaPractice;

public class Repl_118_Array_Print {
    public static void main(String[] args) {
        String[] arr = new String[]{"apple", "banana","kiwi", "grape","milk","soda"};
        for (int i=0;i<arr.length-2;i++){
            System.out.println(arr[i]+", "+arr[i+1]+", "+arr[i+2]);

        }
    }
}
