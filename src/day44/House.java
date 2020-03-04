package day44;

public class House {
    int hNum;
    String design;
    private static String neighborHoodName = "Cybertek Ave";

    public House(int hNum, String design) {
        this.hNum = hNum;
        this.design = design;
    }

    public void showAllInfo(){
        System.out.println(this.hNum+" "+this.design+" "+neighborHoodName);
    }
    public static void showNeighborhoodName(){
        System.out.println(neighborHoodName);
    }

    public void sethNum(int hNum) {
        this.hNum = hNum;
    }

    public void setDesign(String design) {
        this.design = design;
    }
}
