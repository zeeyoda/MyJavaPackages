package ziyodaPractice;

public class Repl_180 {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me") ) ;

    }
    public static String coverString(String main, String coverME){
        String convertString = "";

        for (int i = 0; i < main.length(); i++) {
            if (main.contains(coverME)) {
                convertString = main.replaceAll(coverME, "[" + coverME + "]");
            }
            else{
                convertString = "["+main+"]";
            }


        }

        return convertString;
    }
}
