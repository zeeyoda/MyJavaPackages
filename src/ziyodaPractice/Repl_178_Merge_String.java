package ziyodaPractice;

public class Repl_178_Merge_String {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "hamduck";
        String merge = "";

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                merge += "" + str1.charAt(i) + str2.charAt(i);
            }
            System.out.println(merge);

        }else if (str1.length() > str2.length()) {
            for (int k = 0; k < str2.length(); k++) {
                if (str1.charAt(k) != str2.length()) {
                    merge += "" + str1.charAt(k) + str2.charAt(k);
                }
                System.out.println(merge + str1.substring(str2.length(), str1.length()));
            }
        }else  if (str1.length() < str2.length()) {
                for (int i = 0; i < str1.length(); i++) {

                    merge += "" + str1.charAt(i) + str2.charAt(i);
            }

            System.out.println(merge + str2.substring(str1.length(), str2.length()));
        }




      /*  String all = "";
        for (int i = 0; i < combined.length(); i++) {
            for (int j = 0; j < combined.length(); j++) {
                if (combined.charAt(i) != all.charAt(j)) {
                    all += combined.charAt(i);
                }
            }
        }*/
            // System.out.println(all);


        }
    }


