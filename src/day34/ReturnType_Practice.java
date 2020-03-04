package day34;

public class ReturnType_Practice {
    public static void main(String[] args) {
        printMin4CharacterName("Jon");
        printMin4CharacterName("Java Shark");

    }
    public static void printMin4CharacterName(String name){
        if(name.length()<4){
            System.out.println("Invalid name");
            return;// return is used to get out of the method early
        }
        System.out.println(name);
    }
}
