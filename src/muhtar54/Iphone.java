package muhtar54;

import java.util.function.DoubleToIntFunction;

public class Iphone extends Device {

    String platform;
    @Override
    public void sendMessage(){
        System.out.println("Hi from Iphone.");
    }
    public void faceTime(){
        System.out.println("Using iPhone's face time feature.");
    }
    @Override
    public void call(){
        System.out.println("Calling from the Iphone.");
    }
}
