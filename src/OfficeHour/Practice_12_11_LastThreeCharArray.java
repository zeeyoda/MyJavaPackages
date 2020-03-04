package OfficeHour;

public class Practice_12_11_LastThreeCharArray {
    public static void main(String[] args) {
        String fruit[] = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        //
        for (int i = 0; i < fruit.length; i++) {
            String last3 = fruit[i].substring(fruit[i].length() - 3, fruit[i].length());
            System.out.println(last3);

        }
        for (String eachFruit : fruit) {
            //String last3 = eachFruit.substring(eachFruit.length()-3);
            String last3 = "" + eachFruit.charAt(eachFruit.length() - 3) + eachFruit.charAt(eachFruit.length() - 2) + eachFruit.charAt(eachFruit.length() - 1);
            System.out.println(last3);
        }
        System.out.println("============================================================");
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        float max = prices[0];
        for (float eachPrice : prices) {
            if (eachPrice > max) {
                max = eachPrice;
            }
        }
        System.out.println("Max price " + max);
        System.out.println("============= Max with Continue ==============================");

        float maxWithContinue = prices[0];
        for(float eachPrice: prices){
            if(eachPrice<maxWithContinue){
                continue;
            }
            maxWithContinue=eachPrice;
        }
        System.out.println(maxWithContinue);
        System.out.println("================== Finding Second Max Below=========================");
        float secondMax = prices[0];
        for(float eachPrice: prices){
            if(eachPrice>secondMax && 4.65>eachPrice){
                secondMax=eachPrice;
            }
        }
        System.out.println(secondMax);
        for (int k = 0; k <prices.length; k++) {
            if(prices[k] == secondMax){
                System.out.println("Index number of "+ secondMax+" is: "+k);
            }

        }

    }
}
