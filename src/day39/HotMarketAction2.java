package day39;

public class HotMarketAction2 {
    public static void main(String[] args) {
        Offer_Template jobs1 = new Offer_Template();
        jobs1.location = "Boston, MA";
        jobs1.salary = 100000.00;
        jobs1.company = "BCBS of MA";
        jobs1.isFullTime = true;
        jobs1.displayOfferDeals();
        jobs1.turnToFullTime();
        jobs1.displayOfferDeals();
        System.out.println("====================================================");

        jobs1.changeAllInfo("Amazon","Seattle",105000.00, true);
       // jobs1.displayOfferDeals(); //i am calling the method to print the information
        System.out.println("======================================================");

        //if this guy earns more than 100K
        //move him to Atlanta
        System.out.println("Is it 100K offer? "+jobs1.is100KOffer());
      //  boolean result = jobs1.is100KOffer();
      //  if(result==true){
        //another version - direct version
        if(jobs1.is100KOffer()){
            jobs1.changeLocation("Atlanta");

        }
        jobs1.displayOfferDeals();


       /* Offer_Template jobs2 = new Offer_Template();
        jobs2.location = "Tech City, MA";
        jobs2.salary = 95000.00;
        jobs2.company = "FitBit";
        jobs2.isFullTime = true;
        jobs2.displayOfferDeals();

        Offer_Template jobs3 = new Offer_Template();
        jobs3.location = "Providence, RI";
        jobs3.salary = 990000.00;
        jobs3.company = "Cyber World";
        jobs3.isFullTime = true;
        jobs3.displayOfferDeals();

        Offer_Template jobs4 = new Offer_Template();
        jobs4.location = "Harftford, CT";
        jobs4.salary = 130000.00;
        jobs4.company = "Verizon";
        jobs4.isFullTime = false;
        jobs4.displayOfferDeals();

        Offer_Template jobs5 = new Offer_Template();
        jobs5.location = "NY, NY";
        jobs5.salary = 120000.00;
        jobs5.company = "Trump Taj Mahal";
        jobs5.isFullTime = false;
        jobs5.displayOfferDeals();
        System.out.println("----------------------------");
        jobs3.salary = jobs3.salary+2000;
       // jobs3.salary+=2000; shorter version
        jobs3.displayOfferDeals();

        Offer_Template jobs6 = new Offer_Template();

        jobs6.salary = jobs1.salary+jobs2.salary+jobs3.salary;
        jobs6.displayOfferDeals();
        jobs6.turnToFullTime();
        jobs6.changeLocation("Washington DC");
        jobs6.displayOfferDeals();

        */





    }
}
