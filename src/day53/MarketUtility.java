package day53;

public class MarketUtility {
    public static void main(String[] args) {

        Vegetables veg = new Pepper("red", "sweet",5,"Pepper");
        Vegetables veg2 = new Broccoli("green", "plain", "green veggie");
        displayVeggie(veg);
        displayVeggie(veg2);
        digestBetter(veg);

        Vegetables veg3 = getMyFAvVeg();
        veg3.cook();
        System.out.println(veg3.getClass().getSimpleName());
        System.out.println("My favourite vegetable "+veg3);
        System.out.println(getFavType(1));
        System.out.println(getFavType(2));
        System.out.println(getFavType(3));


    }

    public static Vegetables getFavType(int type){
        if(type==1){
            return new Pepper("red", "sweet",5,"Pepper");
        }
        else if(type==2){
            return new Broccoli("green", "plain", "green veggie");
        }else{
            return null;
        }
    }

    public static void displayVeggie(Vegetables name){
        System.out.println("Displaying my super vegetable \n"+ name.toString());

    }
    public static void digestBetter(Vegetables veggieName){
        veggieName.cook();//cook() is a method from Vegetables abstract class/super class
        veggieName.cook();
        veggieName.cook();
        veggieName.cook();
        System.out.println("Walk to digest "+veggieName+".");


    }

    public static Vegetables getMyFAvVeg(){
//        Vegetables veg = new Pepper("red", "sweet",5,"Pepper");
//        return veg;


        return new Pepper("Blue", "Hot",5,"Hot-Pepper");
    }

}
