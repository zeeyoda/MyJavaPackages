package muhtarDay32;

public class Wrapper_CLass {
    public static void main(String[] args) {
        int numInt = 10;
        Integer numInteger = 10;

        double longnum = 20L;
        Double Longnum = longnum; //Auto-boxing

        System.out.println(longnum);
        System.out.println(Longnum);

        char ch1 = 'L';
        Character ch2 = ch1;// auto-boxing

        char ch3 = ch1; //just regular, no wrapper boxing is going on
        char ch4 = ch2; // un-boxing
        Character ch5 = ch2; //none of the boxing because both are wrapper class values
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5);


    }
}
