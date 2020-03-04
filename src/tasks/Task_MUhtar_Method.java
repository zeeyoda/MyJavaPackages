package tasks;

public class Task_MUhtar_Method {
    public static void main(String[] args) {

        getResult(10,5);

    }
    public static void getResult(int num, int dem){
        if (num % dem == 1) {
            System.out.println("result: " + num / dem + " with a remainder " + num % dem);

        }
        if(num%dem ==0){
            System.out.println(num/dem);
        }


    }
}
