package muhtar54;

public abstract class Device  implements Waterproof{

    int size;
    int price;

    public void call(){
        System.out.println("Calling from Device class.");
    }
    public abstract void sendMessage();
}
