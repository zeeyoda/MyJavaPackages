package muhtar57;

interface Fatih{

    void readBooks();
    abstract void watchTV();
}
abstract class Omer implements Fatih{

    public void readBooks(){
        System.out.println("Omer is reading.");
    }
}

public class Quiz  extends Omer{
    @Override
    public void watchTV(){

    }
}
