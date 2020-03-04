package office_02_10.Task3;
//    create a class called Developers that extends employees:
//    initialize instance variables within the constructor

public class Developers extends Employees {

    public Developers(String name, int num, String jobTitle){
        super(name, num, jobTitle);

    }

    @Override
    public void working() {
        System.out.println("Developers are busy developing.");

    }

    @Override
    public String toString() {
        return "Developers{" +
                "employeeName='" + employeeName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }
}
