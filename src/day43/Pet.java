package day43;

public class Pet {
    /**
     * Pet
     *   attributes
     * 		type
     * 		name
     *   constructor :
     *   		no arg constructor
     *   			set the breed to "unknown"
     *   			set the name to "noname"
     *   		2 args constructor
     *   			set the name and breed to what the caller passed
     *  behaviours
     *  		getters , setters , toString
     *  		speak
     *  			accept no parameter
     *  			according to the type speak following
     *  				cat --> meow
     *  				dog --> woof
     *  				cow --> mooo
     *  				horse --> neinei
     */
    private String type;
    private String name;

    public void speak(){
        switch(type.toLowerCase()){
            case "cat":
        System.out.println("Meow");
        break;
            case "cow":
        System.out.println("moo");
        break;
            case "dog":
               System.out.println("woof");
               break;
            case "Horse":
            System.out.println("neigh neigh");
            break;
            default:
            System.out.println("Unknown animal");
        }
    }

    public Pet(){
        this.type = "unknown";
        this.name = "no-name";

    }
    public Pet(String type, String name){
        this.type = type;
        this.name = name;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void showGeneralPetInfo(){
        System.out.println("Pets are friends of humans");
    }


    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
