package day25;

public class Ziyoda_String_Array_Longest_Word {
    public static void main(String[] args) {

        String phrase = "Are you tickling my toes?";
        String[] phraseSplit = phrase.split(" ");
        String longest = phraseSplit[0];
        int maxCharCount = 0;   // this will find the length of the longest word
        for (String eachPhrase:phraseSplit){
            if(eachPhrase.length()>longest.length()){
                longest=eachPhrase;
                maxCharCount=longest.length();
            }
        }
        System.out.println(longest);
        System.out.println(maxCharCount);

    }
}


