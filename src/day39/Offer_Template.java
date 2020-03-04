package day39;

public class Offer_Template {
    String location;
    String company;
    double salary;
    boolean isFullTime;

    //this is an instance method to print all the information about Offer object
    public void displayOfferDeals(){
        System.out.println("Salary = $"+salary+" | Company = "+company+" | Location = "+location+" | Is it a fulltime job = "+isFullTime);

    System.out.println("Sign on bonus is "+ (salary*.10));
    }
    //write a method called turnToFullTime
    public void turnToFullTime() {
        if (!isFullTime) {
            isFullTime = true;
        }else{
            System.out.println("Already a full time offer");
        }
    }
    //write a method to change the location of the Offer to the location user passed

    public void changeLocation(String newLocation){
        location = newLocation;

    }
    //write a method to accept 4 parameters to change all info about offers

    public void changeAllInfo(String newCompany, String newLocation, double newSalary, boolean newIsFullTime){
        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;
        displayOfferDeals();


    }

    //write a method to check if the offer belongs to 100k club and return the result as true/false

    /**
     * a method to check if offer belongs to 100K club
     * @return true if salary is more than 100K, false or not
     */
    public boolean is100KOffer(){

        return salary>=100000.00;

    }
    /**
     * Create an instance method called toString
     * has no parameter
     * return String representation of Offer Object
     */
    public String toString(){

        String o1Str = ("Location = "+location+", Company = "+company+" | Salary "+salary+" $ | isFullTime = "+
                isFullTime);
        return  o1Str; // ("Location = "+location+", Company = "+company+" | Salary "+salary+" $ | isFullTime = "+
                            //isFullTime);

    }

}
