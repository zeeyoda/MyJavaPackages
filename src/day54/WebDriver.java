package day54;

public interface WebDriver {

    public abstract void openBrowser();
    public abstract void navigate(String url);
    public abstract void maximize();
    public abstract void closeBrowser();
}
