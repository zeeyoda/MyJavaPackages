package muhtar49;

public abstract class Shapes {


    public abstract void area();


}

 abstract class Konus extends Shapes{

     @Override
     public void area(){
         System.out.println("The area of the triangle is ");

     }


        }
class Triangle extends Shapes{

    @Override
    public void area(){
        System.out.println("The area of the triangle is ");

    }

}


