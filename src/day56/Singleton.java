package day56;
/*
    Sometimes we want to make a class that only generate single object
    throughout the entire application

     */

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("Do not call!!");

    }
    public static Singleton getInstance(){
        return new Singleton();
    }




}
