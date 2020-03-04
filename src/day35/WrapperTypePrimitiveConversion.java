package day35;

public class WrapperTypePrimitiveConversion {
    public static void main(String[] args) {

        Integer num1 = 100; // auto-boxing 100--> new Integer (100)
        // Integer.valueOF(...) is a method that return Integer Object
        //It has 2 overloaded version, one that accepts int, and the other that accepts String
        int num2 = Integer.valueOf("200");// auto-unboxing

        // this cannot happen by itself ------>>  int num3 = "200";

        int num3 = Integer.parseInt("200");
        /*
        Integer.parseInt("numberHere) --->> returns int value converted from String

        Integer.parseInt("numberHere") ----->> returns Integer object by wrapping up the number

        You may choose whichever you want because Auto-boxing and auto-unboxing will take care of the the conversion
         */
        //Use this number IPR2012-00001 and store the year into an int variable
        //This case number always start with 2 character either IPR, PGR, CBM, DER
        //followed by year, followed by dash and 5 digit number
        String caseNumber = "IRP2012-00001";
        int year ; // -- get 2012 out of it

        String strYear = caseNumber.substring(3,7);
        year = Integer.parseInt(strYear);
        System.out.println("strYear = "+ strYear);
        System.out.println(getYearOutOfCaseNumber("IRP2012-00001"));
        System.out.println(getYearOutOfCaseNumber("IRP2012-00001"));
        System.out.println(getYearOutOfCaseNumber("IRP2012-00001"));

    }
    public static int getYearOutOfCaseNumber (String caseNumber){
       /* int year ; // -- get 2012 out of it

        String strYear = caseNumber.substring(3,7);
        year = Integer.parseInt(strYear);
        return year;*/
       return Integer.parseInt(caseNumber.substring(3,7));
    }

}
