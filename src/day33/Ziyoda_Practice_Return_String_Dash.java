package day33;

public class Ziyoda_Practice_Return_String_Dash {
    public static void main(String[] args) {
        getSpelledName("Ziyoda");
        System.out.println(getSpelledName("Ziyoda"));
        System.out.println(getSpelledName2("Sabira"));
    }
    public static String getSpelledName(String name){
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            result = result + name.charAt(i);

            if( i!=(name.length()-1)){
                result+= "-";
            }
        }
        return result;
    }
    public static String getSpelledName2(String name) {
        String result = " ";
        for (int x = 0; x < name.length() - 1; x++) {
            result = result + name.charAt(x) + "-";


        }

        return result + name.charAt(name.length() - 1);
    }

    }

