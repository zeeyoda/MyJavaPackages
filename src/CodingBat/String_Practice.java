package CodingBat;

public class String_Practice {
    public static void main(String[] args) {
        String a = "Hay";
        String b = "";

    }
    public String comboString(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
            if (a.length() > b.length()) {
                return b + a + b;
            } else if (b.length() > a.length()) {
                return a + b + a;
            }
        } else if (a.length() == 0) {
            return b;
        }
//        } else if (b.length() == 0) {
//            return a;
        return a;
    }
}
