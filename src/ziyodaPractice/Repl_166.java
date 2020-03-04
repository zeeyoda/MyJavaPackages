package ziyodaPractice;

public class Repl_166 {
    public static void main(String[] args) {
        System.out.println(c_profits(25,25));

    }

    public static String c_profits(int buyPrice, int sellPrice) {

        if (buyPrice < sellPrice) {
            return "profit";
        } else if (buyPrice > sellPrice) {
            return "loss";
        }
            return "no loss";
        }
    }




