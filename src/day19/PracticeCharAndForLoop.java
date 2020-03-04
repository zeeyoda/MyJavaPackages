package day19;

public class PracticeCharAndForLoop {
    public static void main(String[] args) {
        // each character has a corresponding ascii value from prebuilt ascii table

        int a = 'F';
        System.out.println(a);

        char myChar = 'A';
        System.out.println(myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);

        for( char abcChar='A'; abcChar<='Z'; abcChar++){
            System.out.print(abcChar + " ");
            System.out.println("-------------------------");
        }
        for( char abcChar='Z'; abcChar>='A'; abcChar--){
            System.out.print(abcChar + " ");
        }
    }
}
