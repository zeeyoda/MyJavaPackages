package day43;

public class PetStaticPractice {
    public static void main(String[] args) {
        Pet.showGeneralPetInfo();

        String str = String.valueOf(10);

        Pet p1 = new Pet("dog", "Mookie");
        System.out.println(p1.getName());
        p1.speak();
    }
}
