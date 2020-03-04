package ziyodaPractice;

public class Repl_167 {
    public static void main(String[] args) {
        System.out.println(hamletQuote(true, false));
        System.out.println(hamletQuote(true, true));
        System.out.println(hamletQuote(false, true));
        System.out.println(hamletQuote(false, false));
    }
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        //if(toBe==true && notToBe==false||toBe==true && notToBe==true || toBe==false && notToBe==true){
          //  return true;
        //}
        return !(toBe==false && notToBe==false);
    }
}
