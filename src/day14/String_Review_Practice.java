package day14;

public class String_Review_Practice {
    public static void main(String[] args) {
        String str = "I like Pumpkin" ;
        System.out.println( str.contains("pumpkin"));
        System.out.println("str = " + str);

        System.out.println("Does it contain Pumpkin?");
        System.out.println(str.contains("Pumpkin"));
        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumpkin = " + gotPumpkin);
        
        boolean startsWithI = str.startsWith("I");
        System.out.println("startsWithI = " + startsWithI);
        
        boolean endsWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endsWithPumpkin = " + endsWithPumpkin);
    }
}
