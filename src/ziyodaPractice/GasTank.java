package ziyodaPractice;

public class GasTank {
    double amount = 0.0;
    double capacity;

    public GasTank(double capacity){
        this.capacity = capacity;
    }
    public void addGas(double p){
        amount += p;
        if(amount>capacity){
            amount=capacity;
        }
    }
    public void useGas(double param){
        amount = amount-param;
        if(amount-param<0){
            amount=0;
    }
  }
  public boolean isEmpty(){

    return amount<0.1;
  }
  public boolean isFull(){
    return amount>capacity;
  }
  public void getGasLevel(){
    this.amount=amount;
  }
  public double fillUp(){
    double temp = amount;
    amount +=(capacity-amount);
    return capacity-temp;

  }


}
