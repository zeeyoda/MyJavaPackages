package muhtar54;

public class Test2 extends AbstractClass_1 implements InterFace2 {

    public void get(){
        System.out.println("Chrome Browser");
    }
    public void frame(){
        System.out.println("I am from InterFace2 in Test2 class");
    }


    public static void main(String[] args) {

        InterFace obj = new Test2();
        obj.get();

        InterFace2 obj1 = new  Test2();
        obj1.frame();
        obj1.get();

        AbstractClass_1 obj2 = new Test2();

    }
}
