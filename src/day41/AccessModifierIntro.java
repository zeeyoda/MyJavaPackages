package day41;

import day40.BankAccount;

public class AccessModifierIntro {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        //What is default access modifier
        //if there is no access modifier
        //in front of method or field
        //it means it has default access modifier
        //only accessible within the same package
        b1.showAccountBalance();


        //the BankAccount instance field from day40 doesn't have any access modifier
        //so it means it has default access modifier
        b1.balance = 1000;

        Person p1 = new Person();
       // p1.name = "Otabek";
        //p1.age = 19;
        //p1.ssn = 123456789;
        p1.setAll("Hasan", 34, 123456789);
        System.out.println("p1 = " + p1);

        System.out.println("p1.getName() = "+p1.getName());
        p1.setName("Emma");
        System.out.println("p1.getName() = "+p1.getName());
        p1.setAge(45);
        p1.setSsn(562489712);

        int emmaAge = p1.getAge();
        System.out.println("emmaAge = " + emmaAge);
    }
}
