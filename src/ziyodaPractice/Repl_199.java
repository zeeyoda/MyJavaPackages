package ziyodaPractice;
import java.util.*;

public class Repl_199 {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi", "hey", "hi", "yo"));
        String targetWord = "hi";
//        String[] split = targetWord.split("");
//        ArrayList<String> splitWord = new ArrayList<>(Arrays.asList(split));
//        wordList.removeAll(splitWord);
//        System.out.println(wordList);
        removeAll(wordList, targetWord);

    }
    public static void removeAll(ArrayList<String> wordList, String targetWord) {
//        wordList.removeAll(Arrays.asList(targetWord));
//        System.out.println(wordList);

        for (int i = wordList.size()-1; i >=0; i--) {
            if(wordList.get(i).contains(targetWord)){
                wordList.remove(targetWord);

        }

            }


//        while(wordList.contains(targetWord)) {
//            wordList.remove(targetWord);
//        }
        System.out.println(wordList);

    }
    }

