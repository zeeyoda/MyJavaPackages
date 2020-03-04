package muhtar54.muhtar55;

public class Testers extends ScrumTeam {

    public Testers(String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void dailyStandUp(){
        System.out.println("Tester "+name+" is talking.");

    }
    @Override
    public void demo(){
        System.out.println("Tester "+name+" is doing demo.");

    }
    public void findBug(){

    }
}
