package muhtar52;

import com.sun.security.jgss.GSSUtil;

public interface InterfaceIntro {

    int sum = 45;
    public static final double d = 10.0;

    public abstract void methodA();

    public default void methodC(){}

    public static void methodD(){}

    public static void main(String[] args) {
        InterfaceIntro.methodD();
    }

}
class Paper implements InterfaceIntro{
    @Override
    public void methodA(){

    }
}
class CheckInterface{
    public static void main(String[] args) {
        InterfaceIntro.methodD();
        System.out.println(InterfaceIntro.sum);
        System.out.println(InterfaceIntro.d);
    }
}

