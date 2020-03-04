package day23;

public class Ziyoda_Practice_Array_String {
    public static void main(String[] args) {

        String[] family = new String[6];
        family [0] = "Ablatt";
        family [1] = "Ziyoda";
        family [2] = "Sabira";
        family [3] = "Saida";
        family [4] = "Azat";
        family [5] = "Adil";
        //below I would like to show how many members are there in our family
        int memberCount = family.length;
        System.out.println("memberCount = " + memberCount);

        //I want to know the length of each family member's name
        for (int x = 0; x <family.length ; x++) {
            String currentMember = family[x];
            System.out.println(currentMember+" has the following number of letters in his/her name "+ family[x].length());
            System.out.println("--------------------------------------------------------------------------------");
        }
        String[] chocolates ={"M&M", "Mars", "Snickers", "Kisses", "KitKat"};
        int chocolateCount = chocolates.length;
        System.out.println(chocolateCount);
        for (int y = 0; y <chocolates.length ; y++) {
            String currentChocolate = chocolates[y];
            System.out.println("My favorite chocolate is "+ currentChocolate + " It has this many characters " + chocolates[y].length());


        }

    }
}
