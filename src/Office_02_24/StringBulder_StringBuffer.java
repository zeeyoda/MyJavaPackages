package Office_02_24;

public class StringBulder_StringBuffer {
    public static void main(String[] args) {
        String str = "java";
        System.out.println("str is = "+str);

        String str2 = "java";
        System.out.println("str2 is = "+str2);

        str = "selenium";
        System.out.println("str after change = " + str);
        System.out.println("str2 after change "+str2);

        StringBuilder sb1 = new StringBuilder("html");
        StringBuilder sb2 = sb1;
        System.out.println("value of sb1 = " + sb1 +" and sb2 "+sb2);
        sb1 = new StringBuilder("cucumber");
        System.out.println("value of sb1 after change is "+sb1+" and sb2 "+sb2+" after change");

        StringBuilder sb3 = new StringBuilder("jenkins");
        StringBuilder sb4 = sb3;
        System.out.println("values of sb3 "+sb3+" and sb4 "+sb4);
        sb3 = sb3.reverse();
        System.out.println("values of sb3 "+sb3+" and sb4 "+sb4);

    }
}
