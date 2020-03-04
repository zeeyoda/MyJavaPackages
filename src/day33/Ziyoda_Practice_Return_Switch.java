package day33;

public class Ziyoda_Practice_Return_Switch {
    public static void main(String[] args) {
        System.out.println(getDay(5));
        System.out.println(getSize(5));

        int[] allNums = {5, 4, 8, 6, 0};
        for (int x=0; x<allNums.length; x++) {
            String size = getSize(allNums[x]);
            System.out.println(size);
        }
        System.out.println("--------------");
        for (int eachNum: allNums){
            System.out.println("eachNum "+getSize(eachNum));

        }

    }
    public static String getDay(int num){

        switch(num){
            case 1 :
                return "Wear blue";
            case 2 :
                return "Wear pink";
            case 3:
                return "Wear red";
            case 4 :
                return "Wear green";

            default:
                return "Funday";
        }

    }
    public static String getSize(int size){
        if(size<0 && size>3){
            return "Extra Small";
        }else if (size<=3 && size<6){
            return "Small";
        }else if(size<=6 && size<8){
            return "Medium";
        }else if(size<=8 && size<10){
            return "Large";
        }
        return "Invalid size";
    }
}
