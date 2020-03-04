package day33;

public class WarmUp_1 {
    public static void main(String[] args) {
        String spelledName = getSpelledName("Akbarali");
        System.out.println("spelledName = "+spelledName);

        getSpelledName(getSpelledName("Dadajon"));
        getSpelledName(getSpelledName("Adhamjon"));
        System.out.println(getSpelledName2("Irina"));

    }
    public static String getSpelledName2(String name){
        String result = "";
        //keep adding dash until right before last character
        //then concatenate last character
        for (int i = 0; i <name.length()-1; i++) {
            //this loop will add dash after each character
            //until 2nd character from the last
            result += name.charAt(i)+"-";

        }
        // your code goes here
        //result has everything but last character
        //so now we need to add the last character back to the result

        return result+name.charAt(name.length()-1);
    }






    /**create a method getSpelledName
     * this method will take String
     * this method will put dash in between given String
     * for example: Akbar --->> A-k-b-a-r
     * @param name this is the name parameter
     * @return the name has dash in between
     */
    public static String getSpelledName(String name){
        //creating a variable for resulting String
        String result = "";
        for(int i=0; i<name.length(); i++){
             result = result + name.charAt(i);
            //concatenate dash if we are not at last character
            if(i!=name.length()-1){
                result=result+"-";
            }
        }
        return result;
    }
}
