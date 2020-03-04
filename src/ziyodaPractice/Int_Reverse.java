package ziyodaPractice;

public class Int_Reverse {
    public static void main(String[] args) {

        int x = 12345;

        String num = String.valueOf(x);
        String reverse = "";
        for (int i = num.length()-1; i >=0 ; i--) {
            reverse = reverse +num.charAt(i);
        }
        System.out.println(reverse);
    }
}
