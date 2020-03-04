package ziyodaPractice;

public class Repl_217 {
    public static void main(String[] args) {

        int[] products = {1, 1, 1, 1};
        int limit = 5;
        badP(products, limit);

    }

    public static boolean badP(int[] products, int limit) {
        int count = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i] == 0) {
                count++;
            }
        }if(count>=limit){
        return false;
        }
        return true;
    }
}
