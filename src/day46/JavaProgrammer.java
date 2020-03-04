package day46;

public class JavaProgrammer extends Programmer {
    @Override
     void code(){
        System.out.println("Java programmer code");
        super.code();
    }
    @Override
    public void test(){
        super.test();
        System.out.println("Java programmer test");
    }
    public void uniqueCoffee(){
        System.out.println("Drink Coffee");
    }
    public void doJavaDevelopment(){
        System.out.println("Java programmer does Java Development");
    }
}
