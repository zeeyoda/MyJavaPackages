package day23;

public class Ziyoda_Array_ForEachLoopSalary_Min_Max {
    public static void main(String[] args) {

        long[] salaries = {100000, 125000, 115000, 130000, 120000};
        long min = salaries[0];
        long max = salaries[0];
        for(long eachSalary: salaries) {
            /* if(eachSalary>100000) {
                 System.out.println("Each Salary = " + eachSalary);
            }*/
            /*if (eachSalary > 100000) {
                continue;
            }
            System.out.println("Each salary = " + eachSalary);*/

            if (eachSalary > max) {
                max = eachSalary;
            }
            if (eachSalary < min) {
                min = eachSalary;

            }

        }

            System.out.println("max salary is = " + max);
            System.out.println("min salary is = " + min);



    }
}
