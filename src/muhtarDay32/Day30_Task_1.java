package muhtarDay32;

public class Day30_Task_1 {
    public static void main(String[] args) {
       //task 1. write a return method that accepts a String and removes duplicate values from the String
       //example: RemoveSuplicate("aaabbbccc") ===> "abc"

        // task 2. write  a return method that accepts String and returns the unique values from the String
        // example: Unique("AABBCDEEE") ===> "CD"
       String str = RevDup("aaabbbccc");
        System.out.println(str);

       // String str1 = UniqueValue("AABBCDEEE");
        //System.out.println(str1);
        System.out.println(UniqueValue("AABBCDEEE"));
    }
    public static String RevDup(String str){
        String result = "";
        for( int i=0; i< str.length(); i++){
            if(!result.contains(str.substring(i,i+1))){
                result +=str.substring(i, i+1);
            }
        }
        return result;
    }
    public static String UniqueValue(String str1){
        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            int count = 0;
            for (int j = 0; j <str1.length() ; j++) {
                if(str1.charAt(j) == str1.charAt(i)){
                    count++;
                }

            }
            if(count ==1){
                result+=""+str1.charAt(i);
            }
        }
        return result;
    }
}
