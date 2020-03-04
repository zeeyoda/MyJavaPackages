package muhtar54.muhtar55;

public abstract class ScrumTeam {

    String name, jobTitle;
    double salary;

    public abstract void dailyStandUp();

    public abstract void demo();

    public  void getInfo(){
        System.out.println("Employee name "+name);
        System.out.println("Employee title "+jobTitle);
        System.out.println("Employee salary "+salary);
    }


}
