package OfficeHour;

public class Array_Remove_Duplicate_Practice_12_19 {
    public static void main(String[] args) {
        String s1 = "aaabbaaccbbdd";//expected result: abcd
        String s2 = "";// we store non duplicate characters in it

        for (int i = 0; i < s1.length(); i++) {
            String eachChar = ""+s1.charAt(i);
            if(!s2.contains(eachChar)){//we only concat character if that character doesn't exist in s2
                s2 = s2 + eachChar;
            }
        }
        System.out.println(s2);

        //solution two
        String fiveMinutes = "abcabc";
        String[] eachChar = fiveMinutes.split("");
        String result = "";//we need this to store all non=duplicate string object of the array

        for(String each : eachChar ){
            if(!result.contains(each)){
                result += each;
            }
        }
        System.out.println(result);

    }
}
