package muhtar54.muhtar55;

public class Developers extends ScrumTeam {


    public Developers(String name, double salary){
        this.jobTitle = "Developer";
        this.name = name;
        this.salary = salary;
    }
    @Override
    public void dailyStandUp(){
        System.out.println("Developer "+name+" is talking.");

    }
    @Override
    public void demo(){
        System.out.println("Developer "+name+" is doing demo.");

    }

    public void fixBug(){

    }
}
