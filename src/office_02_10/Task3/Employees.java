package office_02_10.Task3;


//    create a class called Developers that extends employees:
//    initialize instance variables within the constructor
//    create a class called Testers that extends employees:
//    initialize instance variables within the constructor
//    create a class called ScrumTeam :
//    instance variables: List<Developers> devTeam;
//    List<Testers> testersTeam;
//    instance methods:
//    addnewTester(Tester tester): adds new tester to the List of testers
//    addnewDeveloper(Developer): adds new developer to the list of developers
//    initialize those instance variables within a constructor
//    create a class called BankofAzerbaijan:
//    create 5 objects of Testers and developers
//    create List of Testers and developers
//    store those objects into those lists
//    create object of Scrum team. add those list of testers and list of develoipers to the scrumteam' terster and developers list
//    BankofAzerbaijan has just hired three more testers "Seda", "Serife" and "Samil". make sure that they are added in ScrumTeam' testers List
//    use for each loop to print out everysingle members of Testers and developers of BankOfAzerbaijan

public abstract class Employees {
    //    Task3:
//    create an abstract class called employees:
//    instance variables: employeeName, employeeID, JobTitle
//    abstract method: working();

    String employeeName,  jobTitle;
    int employeeID;
    public Employees(String employeeName, int employeeID, String jobTitle){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;

    }

    public abstract void working();

}
