package ziyodaPractice;

public class Repl_120_Array_Longest_Length {
    public static void main(String[] args) {
        String[] words = new String[]{"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
        String longest = "";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>longest.length()){
                longest = words[i];
            }
        }
        System.out.println(longest);

       /* for(String eachWord : words){
            if(eachWord.length()>max.length()){
                max=eachWord;
            }
            }
        System.out.println(max);*/

        }
}
