package ziyodaPractice;

public class Repl_125_Array_shortest_word {
    public static void main(String[] args) {

        String[] str = {"java", "cable", "red", "vivid", "remedy", "grace"};
        String shortest =  str[0];
        for (int x=0; x<str.length; x++){
            if(str[x].length()<shortest.length()) {
                shortest = str[x];

            }
        }
        System.out.println(shortest);
        System.out.println("------------------------------------");
        String[] words = new String[]{"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
        String longest = "";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>longest.length()){
                longest = words[i];
            }
        }
        System.out.println(longest);


    }
}
