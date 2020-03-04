package day33;

public class Method_Return_BirthYear_Age_4 {
    public static void main(String[] args) {
        System.out.println(calculateAndReturnAge(1900));
        int[] years = {1999, 122, 2019, 1987, 1978, 1964, 3999, 2004};
        for (int eachYear : years) {
            System.out.println("calculateAndReturnAge() = " + calculateAndReturnAge(eachYear));
            System.out.println(calculateAndReturnAge(1546));

        }
    }


    public static int calculateAndReturnAge(int birthYear){

        if(birthYear<=1900 || birthYear>=2020){
            return 0;
        }
        //if I reach this point, it means the birth year is valid
        return 2019-birthYear;
         //int age ;
        //if(birthYear>=1900 && birthYear<=2019) {
         //   age = 2019 - birthYear;
        //}else{
         //   age = 0;
        //}

       //return age;
    }
}
