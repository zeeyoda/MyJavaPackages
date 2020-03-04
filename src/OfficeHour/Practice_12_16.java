package OfficeHour;

public class Practice_12_16 {
    public static void main(String[] args) {
        String [][] students = {{"1","John","35","Canada"},
                {"2","Kevin","40","Brazil"},
                {"3","Scott","20","Canada"}} ;


String oldestPersonName = students[0][1];// lets infer 1st person is oldest
int ageOfOldestPerson = Integer.parseInt(students[0][2]);//
    for(String[] row : students){
        //go through every row and get value only 3rd column | number-1 = index
        System.out.println(row[2]);// i need to convert it into integer to be able to compare
        int age = Integer.parseInt(row[2]);// converts string into int
        //if age is higher than previous max, then we have new max age and new oldest name

        System.out.println("Age: "+age);
        if(age>ageOfOldestPerson){
            ageOfOldestPerson=Integer.parseInt(row[2]);
            oldestPersonName = row[1];
        }
    }
        System.out.println("Oldest person name is: "+ oldestPersonName);
    }
}
