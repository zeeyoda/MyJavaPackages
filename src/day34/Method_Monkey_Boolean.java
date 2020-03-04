package day34;

public class Method_Monkey_Boolean {
    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));

        System.out.println(monkeyTrouble2(true, true));
        System.out.println(monkeyTrouble2(false, false));
        System.out.println(monkeyTrouble2(true, false));
    }
        /**
         * A method returns true only of both monkeys are smiling or not smiling
         * @param aSmile
         * @param bSmile
         * @return true only if one monkey is smiling
         */
        public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){

            return aSmile==bSmile;
            /*if(aSmile && bSmile || !aSmile && !bSmile){
                return true;
            }else{
                return false;
            }*/
            //return (aSmile && bSmile || !aSmile && !bSmile);
        }
    public static String monkeyTrouble2(boolean aSmile, boolean bSmile) {

        if (aSmile && bSmile || !aSmile && !bSmile) {
            return "yes";
        } else {
            return "no";
        }
    }

    }
