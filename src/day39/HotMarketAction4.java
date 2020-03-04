package day39;

public class HotMarketAction4 {
    public static void main(String[] args) {
        Offer_Template jobs1 = new Offer_Template();
        jobs1.location = "Boston, MA";
        jobs1.salary = 100000.00;
        jobs1.company = "BCBS of MA";
        jobs1.isFullTime = true;

        String o1Str = jobs1.toString();
        System.out.println("o1Str = "+o1Str);

        System.out.println(jobs1.toString());
        //if you directly print out object, it will call toString() method automatically
        System.out.println(jobs1);//this si what is automatically




        Offer_Template jobs2 = new Offer_Template();
        jobs2.location = "Tech City, MA";
        jobs2.salary = 95000.00;
        jobs2.company = "FitBit";
        jobs2.isFullTime = true;
        //jobs2.displayOfferDeals();

        Offer_Template jobs3 = new Offer_Template();
        jobs3.location = "Providence, RI";
        jobs3.salary = 990000.00;
        jobs3.company = "Cyber World";
        jobs3.isFullTime = true;
       // jobs3.displayOfferDeals();

        Offer_Template jobs4 = new Offer_Template();
        jobs4.location = "Harftford, CT";
        jobs4.salary = 130000.00;
        jobs4.company = "Verizon";
        jobs4.isFullTime = false;
        //jobs4.displayOfferDeals();

        Offer_Template jobs5 = new Offer_Template();
        jobs5.location = "NY, NY";
        jobs5.salary = 120000.00;
        jobs5.company = "Trump Taj Mahal";
        //jobs5.isFullTime = false;
    }
}
