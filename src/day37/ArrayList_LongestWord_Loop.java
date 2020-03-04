package day37;

import java.util.ArrayList;

public class ArrayList_LongestWord_Loop {
    public static void main(String[] args) {

        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        System.out.println("nameLst = " + nameLst);

        //find the longest name
        //assume first one is the longest and compare with the rest
        String longestName = nameLst.get(0);
        for (int i = 0; i < nameLst.size(); i++) {
            String eachName = nameLst.get(i);
            // > will give you the first longest name if you have more than one
            // >= will give you the last longest name if you have more than one
            if(eachName.length()>=longestName.length()){
                longestName=eachName;
            }
        }
        System.out.println(longestName);

        //How do I get the concatenation of all longest words if there are more than one
        //first find the longest word, and get the character count
        //then loop through each name
        for (int x = 0; x < nameLst.size(); x++) {
            if(nameLst.get(x).length() == longestName.length()){
                System.out.println("Longest words = "+nameLst.get(x));
            }
        }
        //using for each loop
        System.out.println("Practice with for each loop below");

        for (String eachName: nameLst) {
            System.out.println("Each Name on the list "+ eachName);


        }

    }
}
