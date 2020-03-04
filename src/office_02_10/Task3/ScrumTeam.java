package office_02_10.Task3;
//    create a class called ScrumTeam :
//    instance variables: List<Developers> devTeam;
//    List<Testers> testersTeam;
//    addnewTester(Tester tester): adds new tester to the List of testers
//    addnewDeveloper(Developer): adds new developer to the list of developers
//    initialize those instance variables within a constructor

import java.util.List;

public class ScrumTeam {

    List<Developers> devs;
    List<Testers> testers;
    public ScrumTeam(List<Developers> devops, List<Testers> testerz ){
        devs = devops;
        testers = testerz;
    }

    public void addNewTester(Testers tester){
        testers.add(tester);
    }
    public void addNewDevs(Developers deveps){
        devs.add(deveps);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "devs=" + devs +
                ", testers=" + testers +
                '}';
    }
}
