package OfficeHour;

public class Repl_153 {
    public static void main(String[] args) {
      /*The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30
//String email = fName.substring(0,1)+lName+"@NightWatch.com";
        //String email = fName.charAt(0)+lName+"@NightWatch.com";
        //return email;
        return fName.charAt(0)+lName+"@NightWatch.com";

hint: use the split method to split the string to a string array where there is a "," char*/
      //person("Amira, Halim, 45");
        person("Ziyoda Ablatt 37");


   }
   public static void person(String fullNameAge){
        //String[] strName = str.split(",");
       //System.out.println("person name: "+strName[0]+" last name: "+strName[1]+" age: "+strName[2]);
       String[] splitInfo = fullNameAge.split(" ");
       System.out.println(splitInfo[0]+" "+splitInfo[1]+" "+splitInfo[2]);


   }
}
