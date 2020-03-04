public class Calculator {

    private int result;

    public Calculator minusNum(int num){
        this.result-=num;
        return this;
    }
    public void displayFinaResult(){
        System.out.println("final result = "+ result);
    }

    public Calculator addNum(int num){
        result += num;
//        Calculator c = new Calculator();
//        return c;
        //it will return  the same object you used to call this method
        //it will allow method chaining using same object
        return this;
    }


    public static void main(String[] args){
        Calculator c1 = new Calculator();
       // c1.addNum(100);
        c1.addNum(25).addNum(30).addNum(35).minusNum(50).displayFinaResult();//this is chaining a method call
      //  System.out.println(c1.result);

//        c1 = c1.addNum(50);
//        c1 = c1.addNum(100);
//        c1 = c1.addNum(150);
    }
}
