package office_02_10.Task3;

public class Testers extends Employees {

    public Testers(String nameTest, int numTest, String jobTitleTest) {
        super(nameTest, numTest, jobTitleTest);
    }

        @Override
        public void working(){
            System.out.println("Testers are coding.");

        }

    @Override
    public String toString() {
        return "Testers{" +
                "employeeName='" + employeeName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                '}'+'\n';
    }
}
