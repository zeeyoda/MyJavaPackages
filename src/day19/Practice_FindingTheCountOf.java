package day19;

public class Practice_FindingTheCountOf {
    public static void main(String[] args) {
        //100-200 how many numbers can be divided by 15
        int counter = 0 ;
        for( int x =100; x<=200; x++){
            if(x%15==0){
            System.out.println(x);
                //counter = counter +1;
                //counter +=1;
                ++counter;
            }
        }
        System.out.println("counter= " + counter);
    }
}
