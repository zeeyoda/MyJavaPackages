package day59;

public class FinallyBlock {
    public static void main(String[] args) {

        //in some cases we want to run certain code
        //no matter if exception happens or not
        //as part of try catch -->>

        int[] nums = {1, 4, 6};

    try {
       System.out.println("nums[5] = " + nums[5]);
       //this is what happens when above code gets executed
        // an ArrayIndexOutOfBoundsException object created and thrown to the runtime system
       // throw new ArrayIndexOutOfBoundsException(("Index 100 out of bound for length 3"));

    }catch(Exception e){
        System.out.println("Exception caught \n "+e.getMessage());
    }finally{
        System.out.println("This code will always run no matter we have exception or not");
    }
        System.out.println("The End");
    }
}
