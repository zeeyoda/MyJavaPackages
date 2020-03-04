package ziyodaPractice;

public class repl_64 {
    public static void main(String[] args) {
        String word = "abc";
        int charCount = word.length();

        if(charCount==1) {
            System.out.println(word + word);
        }else if (charCount>2){
            if(charCount%2==1) {
                System.out.println(word.charAt(charCount / 2));
            }else{
                int indexOfFirstHalf = charCount/2-1;
            }

        }
    }
}
