package day27;

public class Task {
    public static void main(String[] args) {
        String[] developersTeam = {"Vladislav","Hasan","Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi","Nursultan"};
        String[] businessAnalystTeam = {"Lisa","Ershad","Naila"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalystTeam};
        int maxLength = scrumTeam[0][0].length();
        String longestString = ""; // store the longest element
        for (String[] each1DArray : scrumTeam) {
            for(String eachElement : each1DArray){//which string has the longest length
                if(maxLength < eachElement.length()){
                    maxLength = eachElement.length();
                    longestString=eachElement;


                }
            }
        }
        System.out.println(maxLength);
    }
}
