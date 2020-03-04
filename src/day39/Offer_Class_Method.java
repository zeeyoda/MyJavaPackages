package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer_Class_Method {
    public static void main(String[] args) {

        Offer_Template jobs1 = new Offer_Template();
        jobs1.location = "Boston, MA";
        jobs1.salary = 100000.00;
        jobs1.company = "BCBS of MA";
        jobs1.isFullTime = true;
        jobs1.displayOfferDeals();


        Offer_Template jobs2 = new Offer_Template();
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

        Offer_Template jobs6 = new Offer_Template();
        //if we don't assign values for instance field/variables
        //we get default value
        //for primitive numbers: 0 or 0.0
                //boolean : false
                //char    : ''
        //fr any other reference types:
                //null
        jobs6.displayOfferDeals();


        List<Offer_Template> offers = new ArrayList<>(Arrays.asList(jobs1, jobs2, jobs3, jobs4, jobs5));
        // offers.add(jobs1);
        //offers.add(jobs2);
        //offers.add(jobs3);
        //offers.add(jobs4);
        //offers.add(jobs5);

        System.out.println(offers);
        for (Offer_Template eachOffer : offers) {
            if (eachOffer.salary < 100000) {
                eachOffer.salary+=5000;

            }
            System.out.println(eachOffer.salary);
            }

        for (int i = 0; i < offers.size(); i++) {
            Offer_Template each = offers.get(i);
            each.displayOfferDeals();
           // offers.get(i).displayOfferDeals(); -->> direct version
            if(offers.get(i).salary<500){
                offers.get(i).salary+=5000;
            }

        }


    }
}

