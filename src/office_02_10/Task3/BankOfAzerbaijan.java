package office_02_10.Task3;
//    create a class called BankofAzerbaijan:
//    create 5 objects of Testers and developers
//    create List of Testers and developers
//    store those objects into those lists
//    create object of Scrum team. add those list of testers and list of develoipers to the scrumteam' terster and developers list
//    BankofAzerbaijan has just hired three more testers "Seda", "Serife" and "Samil". make sure that they are added in ScrumTeam' testers List
//    use for each loop to print out everysingle members of Testers and developers of BankOfAzerbaijan


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankOfAzerbaijan {
    public static void main(String[] args) {
        Testers t1 = new Testers("Tom", 578, "SDET");
        Testers t2 = new Testers("Jerry", 546, "Software Engineer");
        Testers t3 = new Testers("Mookie", 205, "Software Tester");
        Testers t4 = new Testers("Cookie", 100, "Manual Tester");
        Testers t5 = new Testers("Junior", 200, "SDET");

        Developers d1 = new Developers("Sanjay", 1000, "Software Developer" );
        Developers d2 = new Developers("Jarret", 2000, "Programmer");
        Developers d3 = new Developers("Ziyoda", 3000,"Software engineer");
        Developers d4 = new Developers("Tina",4000, "Computer Programmer"  );
        Developers d5 = new Developers("Mark", 5000, "Application Developer");

        List<Testers> testers = new ArrayList<>(Arrays.asList(t1, t2, t3, t4, t5));

        List<Developers> devs = new ArrayList<>(Arrays.asList(d1, d2, d3, d4, d5));

        ScrumTeam bankofAzerbaijan = new ScrumTeam(devs, testers);
        bankofAzerbaijan.testers.add(new Testers("Ablatt", 6523, "Intern Tester"));
        bankofAzerbaijan.testers.add(new Testers("Azat", 8999,"Student Tester"));
        bankofAzerbaijan.testers.add(new Testers("Adil", 1254, "Senior Tester"));

       List<ScrumTeam> bankofAzerbaijan1 = new ArrayList<>(Arrays.asList(bankofAzerbaijan));
        for (ScrumTeam each:bankofAzerbaijan1) {
            System.out.println(each.testers);

            // System.out.println(each.devs);

        }
    }
}
