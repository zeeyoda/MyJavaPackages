package day17;

public class Full_Name_Character {
    public static void main(String[] args) {
        String fullName = "arYa sTarK";
        String firstName = fullName.substring(0, 4);
        String lastName = fullName.substring(5);

        String firstNameCorrected = firstName.toUpperCase().substring(0,1)
                + firstName.toLowerCase().substring(1);
        System.out.println(firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1)+
                lastName.toLowerCase().substring(1);
        System.out.println("lastNameCorrected = " + lastNameCorrected);

        fullName = firstNameCorrected + " " + lastNameCorrected;
        System.out.println(fullName);


    }

}
