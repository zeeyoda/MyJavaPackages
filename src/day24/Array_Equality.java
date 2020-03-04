package day24;

import java.util.Arrays;

public class Array_Equality {
    public static void main(String[] args) {

        int[] scores1 = {2,5,6,7,3,34,6};
        int[] scores2 = {22, 45, 36, 52, 89};
        int[] scores3 = {2,5,6,7,3,34,6};
        int[] scores4 = {34,6,5,2,7,3,6};

        boolean isS1S2Equals = Arrays.equals(scores1,scores2);
        System.out.println("isS1S2Equals = " + isS1S2Equals);

        boolean isS1S3Equals = Arrays.equals(scores1,scores3);
        System.out.println("isS1S3Equals = " + isS1S3Equals);
        System.out.println("Comparing score 3 and score 4 before sorting");
        boolean isS3S4Equals = Arrays.equals(scores3,scores4);
        System.out.println("isS3S4Equals = " + isS3S4Equals);

        System.out.println("Sorting score 3 and score 4 then compare equality");
        Arrays.sort(scores3);
        Arrays.sort(scores4);

        boolean isS3S4Equals1 = Arrays.equals(scores3, scores4);
        //comparing after sorting
        System.out.println("Scores3 and Scores4 comparison result after sorting: "+isS3S4Equals1);

    }
}
