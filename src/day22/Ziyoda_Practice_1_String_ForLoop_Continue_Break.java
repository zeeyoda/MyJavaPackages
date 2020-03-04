package day22;

public class Ziyoda_Practice_1_String_ForLoop_Continue_Break {
    public static void main(String[] args) {
        //in this task skip every odd number and break at equalsIgnorecase a
        String msg = "I love Java Java java very much in this beautiful world";
        for (int x = 0; x < msg.length(); x++) {
            if (x % 2 == 1) {
                continue;
            }

                String currentChar = msg.substring(x, x + 1);
                if (currentChar.equalsIgnoreCase("a")) {
                    break;
                }
                System.out.print(currentChar);
            }
        System.out.println("-----------------------------------------------");
        String sentence = "Pistachios are so good. Do you like them?";
        //in this task skip every even number and break at equalsIgnoreCase l
        for (int i = 0; i < sentence.length(); i++) {
            if (i % 2 == 1) {
                continue;
            }
            String currentChar = sentence.substring(i, i + 1);
            if (currentChar.equalsIgnoreCase("l")) {
                break;
            }
            System.out.print(currentChar);


        }
        System.out.println("\n");
        String animals = "Animal babies are very cute.";
        //in this task skip every 4th character and break at equalsIgnoreCase c
        for(int idx=0; idx<animals.length(); idx++) {
            if (idx % 4 == 0) {
                continue;
            }
            String currentChar = animals.substring(idx, idx + 1);
            if (currentChar.equalsIgnoreCase("c")) {
                break;
            }
            System.out.print(currentChar);
        }
        }

    }

