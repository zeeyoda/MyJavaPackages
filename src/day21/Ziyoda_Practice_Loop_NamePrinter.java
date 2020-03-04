package day21;

public class Ziyoda_Practice_Loop_NamePrinter {
    public static void main(String[] args) {
        String name = "Sabira";
        int lastIndex = name.length()-1;
       for(int x=0; x<lastIndex; x++){
           System.out.print(name.substring(x, x+1 )+ "-->");
        }
        for (int i = lastIndex; i<name.length() ; i++) {
            System.out.println(name.substring(i));
        }


    }
}
