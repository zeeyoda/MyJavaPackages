package day31;

public class Method_Practice_3 {
    //write piece of reusable code to count from 1 to 10
    //give a name count1to10
    //no need for object when being called             :static
    //it should be accessible anywhere in your project :public
    //it does not return  any value                    :void
    //does not need an external data                   :(nothing inside)


    //doesn't matter where you put the method
    //as long as it is inside the class {} and outside of any of the method
    public static void main(String[] args) {

            count1to10();
       // System.out.println();
            count1to10();
            //optionally you can call using classname.methodName();
        Method_Practice_3.count1to10();


    }
public static void count1to10(){

        for(int i=1;i<=10;i++){
        System.out.print(i+" ");

        }
        System.out.println("\n");
        }
}

