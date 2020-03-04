package muhtar53;

import com.sun.security.jgss.GSSUtil;

public interface Interface_VS_CLass {
    public abstract void method1();
    public abstract int method2();

    public void method3(); // even though abstract is not stated, it is automatically given in the background

    public default void method4(){

    }
    int a = 10;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(Interface_VS_CLass.a);
    }
}


