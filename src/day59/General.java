package day59;

public class General {
    public static void main(String[] args) {

        Object o = new String("abc");
        //can I get the first char using 0
        //System.out.println(o.charAt(0));

        String str = "";
        try {
            System.out.println(str.charAt(0));
            System.out.println("End of try");

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Exception father is here");
//        }  catch (NullPointerException e) { // if the super Exception class that catches any action, then there is
            //no point in using subclass Exception in catch statement. If using multi catch block, then child type
            //should come first, the more generic type should come last
//            System.out.println("No Object here!!!");
        }
        System.out.println("The end.");
    }
}
