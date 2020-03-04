package ziyodaPractice.Repl239;

public class Dog extends Animal {
    String breed;
    int humanYears;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed=breed;
    }
    @Override
    public int getAgeInHumanYears(int age){
        if(age<=2){
            return age*11;
        }
        return 22+((age-2)*5);
    }
//    @Override
//    public boolean equals(Dog obj){
//        if(super.etName(getName())s.equals(obj.name) && this.age==other.age && this.breed.equals(obj.breed)){
//            return true;
//        }else{
//            return false;
//        }


    @Override
    public String toString(){

        return "Name: "+getName()+"\n"+
                "Breed: "+breed+"\n"+
                "Age in calendar years: "+getAge()+"\n"+
                "Age in human years: "+humanYears;

    }
}
