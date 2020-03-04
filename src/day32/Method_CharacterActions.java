package day32;

public class Method_CharacterActions {
    public static void main(String[] args) {

      //  printAtoZ();
      //  printZtoA();
        printAlphabetInRange('a','f');
        printAlphabetInRange('D','A');
        printAlphabetInRange('A','A');
        printAlphabetInRange('Z','a');

    }

    public static void printAlphabetInRange(char beginning, char ending){
        if(beginning<ending) {
            System.out.println("We need to increment from " + beginning + " till " + ending);
            for (int iChar = beginning; iChar <=ending ; iChar++) {
                System.out.print(iChar+" ");
            }
            System.out.println();
        }else if(beginning>ending){
            System.out.println("We need to decrement from "+ ending + " till "+ ending);
            for (int iChar = 0; iChar >=ending ; iChar--) {
                System.out.print(iChar+" ");
            }
            System.out.println();
        }else{
            System.out.println("They are the same character");
        }

    }/*
    public static void printAtoZ(){
        for(char x='A'; x<='Z'; x++){
            System.out.print(x+ " ");
        }
        System.out.println();
    }
    public static void printZtoA(){
        for(char x='Z'; x>='A'; x--){
            System.out.print(x+" ");
        }
        System.out.println();
    }*/
}

