package muhtar54;

public class Zoo {

    public static void main(String[] args) {

        Tiger tiger1 = new Tiger();

        Tiger[] tiger = {tiger1, new Tiger()};

        Octopus octopus1 = new Octopus();
        Octopus[] octopus = {octopus1, new Octopus()};

        Animal animal1 = new Tiger();
        Animal animal2 = new Tiger();

        animal1.talk();





    }
}
