package day40;

public class Spaceship {

    String name;
    String currentDirection;
    int x;
    int y;

    //behaviors:

         //* setInitialPosition void method
             //accepts 2 int parameters
             //to provide initial position of spaceship
    public void setInitialPosition(int newX, int newY){

       x = newX;
       y = newY;

    }
    //*Set Direction void method
    //accept 1 String parameter to set the direction

    public void setDirection(String newDirection){
        //directions can only be up, down, right, left
        if(newDirection.equalsIgnoreCase("up")||
                newDirection.equalsIgnoreCase("down")||
                newDirection.equalsIgnoreCase("right")||
                newDirection.equalsIgnoreCase("left")) {

            currentDirection = newDirection;
        }else{
            System.out.println("Invalid direction");
            currentDirection = "";
        }
    }

    //*move1Block void method, accept no parameter
    //and change position according to the direction
    //move spaceship to 1 block according to the current direction
    public void mov1Block(){
        switch (currentDirection){
            case    "right":
                x+=1;
                break;
            case "left":
                x-=1;
                break;
            case "up":
                y+=1;
                break;
            case "down":
                y -=1;
                break;
            default:
                break;
        }
    }
    //add a functionality to move1Block with direction provided in one shot
    public void mov1Block(String newDirection){
        setDirection(newDirection);
        mov1Block();
    }


    public String toString() {
        return "Spaceship{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
