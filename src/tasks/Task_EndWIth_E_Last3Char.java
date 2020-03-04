package tasks;

public class Task_EndWIth_E_Last3Char {
    public static void main(String[] args) {
        String fruits[] = {"apple","banana","grape","strawberry","blueberry","kiwi"};
        for (int i = 0; i < fruits.length; i++) {
          String str = fruits[i];

           /* if(str.endsWith("e")) {
                System.out.println(str);
            }*/
            if(!str.endsWith("e")){
                continue;
            }
            System.out.println(str);
        }
        System.out.println("----------------------------------------------------------------");
        for(String eachFruit: fruits){

            char lastChar = eachFruit.charAt(eachFruit.length()-1);
            if(lastChar == 'e'){
                System.out.println(eachFruit);

            }
        }
        for (int i = 0; i <fruits.length ; i++) {
            System.out.println();

        }
        //get last 3 characters of each array element
        for(int x=0; x<fruits.length; x++){
            String last3 = fruits[x].substring(fruits[x].length()-3, fruits[x].length());
            System.out.println(last3);
        }
        for(String eachFruit: fruits){
            String last3 = eachFruit.substring(eachFruit.length()-3, eachFruit.length());
            System.out.println(last3);
        }
    }
}
