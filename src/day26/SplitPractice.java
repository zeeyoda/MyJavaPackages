package day26;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        // 2 additional String methods related to array are
        //toCharArray(), another is split(bySomething)

        String survey = "Complete B15 online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();
        System.out.println(Arrays.toString(surveyChars));
        Arrays.sort(surveyChars);
        System.out.println(Arrays.toString(surveyChars));

        for (char eachSurvey : surveyChars) {
            System.out.println("each char is: "+eachSurvey);
            }
        // we will use while loop
        int x=0;
        while(x<surveyChars.length){
            System.out.println("each char is: "+ surveyChars[x]);
            x++;
        }
        //for loop version
        for (int i = 0; i <surveyChars.length ; i++) {
            System.out.println("each char with for loop "+ surveyChars[i]);
        }
        int y=0;
        do{
            System.out.println(surveyChars[y]);
            y++;
        }while(y<surveyChars.length);
        }


    }

