package muhtar54;

public class Samsung extends Device {

    String color;
    @Override
    public void call(){
        System.out.println("Calling from Samsung.");
    }
    @Override
    public void sendMessage(){
        System.out.println("Hi from Samsung.");
    }
    public void takePicture(){
        System.out.println("Samsung is taking a picture.");
    }
}
