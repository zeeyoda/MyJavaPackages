package ziyodaPractice;

import java.util.Arrays;

public class Repl_160 {
    public static void main(String[] args) {

        String[] arr ={"java", "code", "python", "code", "rust", "code", "rust"};

        for (String eachArr :arr) {
            int count = 0;
            for (String eachName : arr) {
                if(eachName.equals(eachArr)){
                    count++;
                }
        }
            if(count == 1){
                System.out.println(eachArr);
                }


        }

    }
}
