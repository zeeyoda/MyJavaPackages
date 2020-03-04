package day21;

public class Ziyoda_Practice_Loop_Break {
    public static void main(String[] args) {

      /*  String name = "Ablatjon";

        for (int x = 0; x <= name.length(); x++) {
            char currentChar = name.charAt(x);

            if (currentChar == 'a') {
                System.out.println("Found it");
                break;
            }
            System.out.println(currentChar);
        }*/
            String family = "BIzning oilamIz katta";
            for (int y = 0; y <= family.length(); y++) {
                String currentChar1 = family.substring(y, y + 1);
                if (currentChar1.equalsIgnoreCase("t")) {
                    System.out.print(" t goes here ");
                    break;
                }
                System.out.print(currentChar1);
            }
        }
    }
