package muhtar54;

public class TestDevice {
    public static void main(String[] args) {
        //Device d = new Device();

        //parent class/interface == Device
        //reference == d1;
        //object(new Samsung) type child class
        Device d1 = new Samsung();
        Device d2 = new Samsung();
        d2.price = 15;
        d2.size = 5;

        Waterproof w = new Samsung();

        Device d3 = new Iphone();
        d3.size = 16;
        d3.size = 780;
        d3.call();
        System.out.println("=======================");
        Iphone i2 = new Iphone();
        i2.price = 500;
        i2.size = 64;
        i2.platform = "IOS";
        i2.call();

        System.out.println("===================================");
        Samsung s = new Samsung();
        s.call();
        s.sendMessage();
        s.takePicture();


        Iphone i = new Iphone();
        i.call();
        i.sendMessage();
    }
}
