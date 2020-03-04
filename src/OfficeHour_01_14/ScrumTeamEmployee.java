package OfficeHour_01_14;

public class ScrumTeamEmployee {

    String jobTitle;
    String name;
    double salary;
    int employee_ID;
    int age;

    //what can scrum team does? actions --> methods
    public void standUp(){
        System.out.println("This team's stand up meeting is at 10:45am.");
    }

    public void demo(){
        System.out.println(name+" is doing demo.");
    }


    public void getEmployeeInfo(){
        System.out.println("Name: "+name+". Job title: "+jobTitle+". Employee ID: "+employee_ID+
                            ". Salary: "+salary+". Age: "+age);
    }
}
