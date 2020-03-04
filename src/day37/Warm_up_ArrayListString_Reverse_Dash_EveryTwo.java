package day37;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Warm_up_ArrayListString_Reverse_Dash_EveryTwo {
    public static void main(String[] args) {
        /*
        Create Arraylist of String and store
teamMates
print one by one
print reverse
print first last
print 2 at a time
concat everyone in one string separated by -
         */

        List<String> teamMates = new ArrayList<>();

        teamMates.add("Betul");
        teamMates.add("Ainura");
        teamMates.add("Subi");
        teamMates.add("Tugba");
        teamMates.add("Nailya");
        teamMates.add("Sofiyya");
        teamMates.add("Abbos");
        teamMates.add("Burhan");
        teamMates.add("Ilnura");
        teamMates.add("Cristina");
        teamMates.add("Gular");
        teamMates.add("Sezgin");
        teamMates.add("Seda");
        teamMates.add("Mehmet");
        teamMates.add("Ziyoda");
        teamMates.add("Nargiza");

        for (String each : teamMates) {
            System.out.println(each);
        }
        for (int i = teamMates.size() - 1; i >= 0; i--) {
            System.out.print(teamMates.get(i) + ", ");

        }
        System.out.println();
        System.out.println("Item at first index " + teamMates.get(0));
        System.out.println("Item at last index " + teamMates.get(teamMates.size() - 1));

        System.out.println();
        String result = "";
        for (int y = 0; y < teamMates.size() - 1; y++) {
            result += teamMates.get(y) + "-";
        }
        System.out.println(result + teamMates.get(teamMates.size() - 1));

        System.out.println("Another way of printing 2 items at a time 1-2, 2-3, 3-4 etc..");
        for (int l = 0; l <= teamMates.size() - 2; l++) {
            System.out.println(teamMates.get(l) + " " + teamMates.get(l + 1));
        }
        System.out.println("==================================");
        System.out.println("Printing items 2 at a time, no repetition ---- 1-2, 3-4, 5-6");
        for (int m = 0; m < teamMates.size() - 1; m++) {
            System.out.println("Printing every 2 items " + teamMates.get(m) + " " + teamMates.get(m + 1));
            m++;

        }
        System.out.println("Another way printing 2 at a team with no repetition");
        for (int i = 0; i < teamMates.size() - 2; i += 2) {
            System.out.println(teamMates.get(i) + " " + teamMates.get(i + 1));

        }
        //System.out.println(teamMates.get(teamMates.size()-1));// we add this if it is a String with odd size total
        System.out.println("Printing every 3 items at a time");
        for (int n = 0; n < teamMates.size() - 3; n += 3) {
            System.out.println(teamMates.get(n) + " " + teamMates.get(n + 1) + " " + teamMates.get(n + 2));

        }
        System.out.println(teamMates.get(teamMates.size() - 1));


        String lstToString = teamMates.toString();
        System.out.print("listToString "+lstToString);
        System.out.println();
        System.out.println("listToString "+lstToString.replace(",","-")
                                                      .replace("[","")
                                                        .replace("]",""));
    }

    }

