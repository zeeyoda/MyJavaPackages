package day17;

public class Wake_Up_Task_Name {
    public static void main(String[] args) {
       /* String name = "ziYOda";
       //substring method is copy the part of String inside another String
       //it has 2 versions:
       //1, start with certain index and end at ending index
       //2, start with certain index and get the rest of the String

        System.out.println(name.replace("ziYOda", "Ziyoda"));

        String name2 = "ziyoda";
        System.out.println(name2.replaceFirst("z", "Z"));
        */
       /*String name = "kHumAyRa";
       //First approach -- get the first character -->> make it uppercase
        //get the rest of the characters starting from 2nd character
        //then make it lowercase
        //eventually concatenate them
        String nameFixed = (name.charAt(0)+"").toUpperCase();
        nameFixed = nameFixed + name.substring(1).toLowerCase();
        System.out.println("nameFixed = " + nameFixed);

        */
       String name = "kHumAyRa";
       String nameFixed = name.toUpperCase().substring(0,1);
       nameFixed += name.substring(1).toLowerCase();

        System.out.println("nameFixed = " + nameFixed);

        //Second approach -- make whole name uppercase, then get the first character
        //get the rest of the characters starting from 2nd character

        //Optionally ask your name from Scanner

    }
}
