package muhtarDay32;

import org.w3c.dom.ls.LSOutput;

public class Practice_Removing_Dup {
    public static void main(String[] args) {
        String str = "ndkfjhrbscflk";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i, i + 1))) {
                result += str.substring(i, i + 1);
            }
        }
        System.out.println(result);
        System.out.println("--------------------------------------");

        String list = "Ziyoda Ablatt Sabira Saida Adil Azat Saniya";
        String natija = "";
        for (int i = 0; i < list.length(); i++) {
            if(!natija.contains(list.substring(i, i+1))){
                natija+=list.substring(i, i+1);
            }
        }
        System.out.println(natija);

    }
    }

