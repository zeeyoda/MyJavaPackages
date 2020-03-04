package day23;

public class For_Each_Loop_Practice {
    public static void main(String[] args) {

    /*
    create a long array or 5 items called salaries
    put your desired salaries

    use for each loop to iterate over them and print

    print only salary more than 100000

    use for each loop to find the max
    use for each loop to find the min
     */
        long[] salaries = {105000, 150000, 160000, 125000, 145000, 130000};
        for (long  desired : salaries ) {
            System.out.println("Salary I want is: " + desired);

        }
        for (long  salary: salaries) {
            //how can I skip salaries less than or equal to 100000
            if(salary<=150000) {
                continue;
            }
                System.out.println("salaries = " + salary);
            }
            int[] classNumber = {25, 35, 45, 23, 46};
        for(int studentCount : classNumber){
            System.out.println("Student count is "+ studentCount);
        }



        }

    }

