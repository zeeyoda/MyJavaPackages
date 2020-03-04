package day21;

public class BreakContinue {
    public static void main(String[] args) {


        for(int x = 1; x <= 5 ; x++){

            System.out.println(x);
            if(x==5){// this is useless, after iteration lopp will stop by itself
                break;
            }
            continue;// this is pointless, 'cuse after each iteration it is going to next iteration anyway

            }
        }
    }

