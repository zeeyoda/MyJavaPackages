package muhtar54;

abstract class AbstractClass{

    public static void byLinkText(){
        System.out.println("Link text super");
    }
    public void get(){
        System.out.println("Chrome");
    }

}


public class Test extends AbstractClass_1 {

    public void get(){
        System.out.println("Fire fox");
    }

    public static void byLinkText(){
        System.out.println("Link text sub");
    }
    public static void main(String[] args) {

        AbstractClass_1 obj = new Test();
//        obj.get();
//        obj.byLinkText();
    }


}
