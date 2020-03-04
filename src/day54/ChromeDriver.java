package day54;

public class ChromeDriver implements WebDriver {


    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome browser.");

    }

    @Override
    public void navigate(String url) {
        System.out.println("Navigate to url "+url+" using Chrome Browser.");

    }
    @Override
    public void maximize() {
        System.out.println("Maximize Chrome Browser.");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser.");

    }


}
