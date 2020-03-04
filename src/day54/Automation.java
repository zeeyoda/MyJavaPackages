package day54;

public class Automation {

    public static void main(String[] args) {
        ChromeDriver c1 = new ChromeDriver();

        WebDriver w1 = new ChromeDriver();
        w1.openBrowser();
        w1.navigate("www.cybertekschool.com");
        w1.maximize();
        w1.closeBrowser();

        System.out.println("---------------------Running on FireFox-----------------------------------");
        w1 = new FireFoxDriver();
        w1.openBrowser();
        w1.navigate("www.amazonschool.com");
        w1.maximize();
        w1.closeBrowser();



    }
}
