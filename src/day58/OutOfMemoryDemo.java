package day58;
import java.util.*;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i > 0 ; i++) {
            //System.out.print(i);
            nums.add(i);

        }

    }
}
