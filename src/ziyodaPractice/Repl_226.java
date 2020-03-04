package ziyodaPractice;

public class Repl_226 {
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below
    public Repl_226(){
        width = 300;
        length = 300;
        totalPrice = 200;
        unitPrice = 0;

    }
    public Repl_226(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        totalPrice = (width+length)*unitPrice;
        if(isPersian == true){
            totalPrice +=200;
        }else{
            totalPrice = (width+length)*unitPrice;
        }
    }
}
