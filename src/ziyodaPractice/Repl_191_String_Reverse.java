package ziyodaPractice;

public class Repl_191_String_Reverse {
    public static void main(String[] args) {
        String input = "Student";
       reverse("Student");
        System.out.println(reverse("Student"));

        }


    public static String reverse(String input){
        String reverse = "";
        for (int i = input.length()-1; i >=0 ; i--) {
            reverse+= input.charAt(i);

        }
        return reverse;

    }
}
