package muhtar54.muhtar55;

import java.util.ArrayList;
import java.util.Arrays;

public class BOF {
    public static void main(String[] args) {

       Testers Madina = new Testers("Madina", "SDET", 130000);
       Madina.dailyStandUp();
       Madina.getInfo();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


       Testers Ziyoda  = new Testers("Ziyoda", "Automation tester", 120000);


       Testers Erhan = new Testers("Azat", "Manual tester", 150000);

       Testers[] testers = {Madina, Ziyoda, Erhan};
        for (Testers each : testers) {
            each.getInfo();
            System.out.println("====================================================");

        }

        Developers d1 = new Developers("Nadira", 145000);
        Developers d2 = new Developers("Sabira", 150000);
        Developers d3 = new Developers("Saida", 130000);
        Developers d4 = new Developers("Adil", 200000);

        Developers[] allDevs = {d1, d2, d3, d4};
        for (Developers each: allDevs) {
            each.getInfo();
            System.out.println("*********************************************");

        }
        ArrayList<ScrumTeam> allTeams = new ArrayList<>();
        allTeams.addAll(Arrays.asList(testers));
        allTeams.addAll(Arrays.asList(allDevs));

        for (ScrumTeam eachTeam: allTeams) {
            eachTeam.getInfo();
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            
        }



    }
}
