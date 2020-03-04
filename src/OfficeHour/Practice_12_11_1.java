package OfficeHour;

public class Practice_12_11_1 {
    public static void main(String[] args) {
        String fruit[] = {"apple", "banana","grape","strawberry","blueberry","kiwi"};
        //length: return the total number of elements

        //1.7 print out only those items end with letter e
        for (int i = 0; i < fruit.length; i++) {
            String str = fruit[i];
           /* System.out.println(str);
            if( str.endsWith("e")){
                System.out.println(str);
            }*/
           if(!str.endsWith("e")){
               continue;
           }
            System.out.println(str);

        }
        System.out.println("==============================================");
    /* for (Variable : Collection of data){
                statement;
                }
                variable must be representing each element of the collection of data
     */
        for (String eachItem : fruit) {
            char lastChar = eachItem.charAt(eachItem.length()-1);
            if( lastChar == 'e'){
                System.out.println(eachItem);
            }

        }

    }

}
