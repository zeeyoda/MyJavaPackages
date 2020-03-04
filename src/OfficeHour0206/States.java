package OfficeHour0206;

public abstract class States {
    String stateName;

    public  void tax(){
        System.out.println("General tax rate is 5%");

    }
    public final void method(){
        System.out.println("method from State abstract class.");
    }
}

class Kentucky extends States{

    String stateName = "KY";

    public void tax(){
        System.out.println("Tax rate in KY is 6%");
    }
    public void KFC(){
        System.out.println("KY has KFC");
    }
    public final void method(int a){
        System.out.println("Method from Kentucky");
    }

}
class California extends States{
    String stateName = "CA";

    @Override
    public void tax() {
        System.out.println("Tax rate in CA is 9%");
    }
    public void hollywood(){
        System.out.println("There is Hollywood in CA");
    }
    public final void method(String weather){
        System.out.println("It is beautiful in CA.");

    }
}
