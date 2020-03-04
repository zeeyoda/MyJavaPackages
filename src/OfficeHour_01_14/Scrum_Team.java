package OfficeHour_01_14;

public class Scrum_Team {
    public static void main(String[] args) {

        //we are going to create an object
        //       empl1--->>> reference     //new ScrumTeamEmployee() --->> object
        ScrumTeamEmployee empl1 = new ScrumTeamEmployee();
        empl1.name = "Ziyoda";
        empl1.employee_ID = 123;
        empl1.jobTitle = "PO";
        empl1.salary = 112000.00;
        empl1.age = 28;

        ScrumTeamEmployee empl2 = new ScrumTeamEmployee();
        empl2.name = "Saida";
        empl2.employee_ID = 243;
        empl2.jobTitle = "Tester";


        ScrumTeamEmployee empl3 = new ScrumTeamEmployee();
        empl3.name = "Sabira";
        empl3.employee_ID = 523;
        empl3.jobTitle = "Developer";

        empl3.standUp();
        System.out.println("Employee01's name is: "+empl1.name);
        System.out.println("Empl1's job title "+empl1.jobTitle);
        System.out.println("Empl1's employee ID is "+empl1.employee_ID);

        empl1.getEmployeeInfo();
        empl2.getEmployeeInfo();

        empl1.demo();
        empl2.demo();
        empl3.demo();


    }
}
