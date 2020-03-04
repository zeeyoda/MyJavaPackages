package day54;

public class FireFoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening FireFox browser.");

    }

    @Override
    public void navigate(String url) {
        System.out.println("Navigate to url "+url+" using FireFox Browser.");

    }
    @Override
    public void maximize() {
        System.out.println("Maximize FireFox Browser.");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox Browser.");

    }

}
