package OfficeHour;

public class Practice_12_1_Second {
    public static void main(String[] args) {
        String letters = "J%aV**$a";
        System.out.println("letters before = " + letters);
        //remove % ^ *  $ (
        letters = letters.replace("%", "") //"Ja^V**$a"
                          .replace("^", "")//"JaV**$a
                          .replace("*", "")//"JAV$a
                          .replace("$", "")//JaVa
                          .toUpperCase();//JAVA
        System.out.println("letters = " + letters);


    }
}
