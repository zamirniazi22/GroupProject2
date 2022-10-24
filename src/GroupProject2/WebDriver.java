package GroupProject2;

public interface WebDriver {
    void open();
    void close();

    String getTitle();

}
interface TakesScreenshot {

    void getScreenShot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot {

    void navigate();
}
class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening Chrome Driver");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome Driver");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Chrome Driver");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Takes a screenshot");
    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Firefox Driver");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox Driver");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Firefox Driver");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Takes a screenshot");
    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening Safari Driver");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari Driver");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Safari Driver");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Takes a screenshot");
    }
}
class TestingCode {
    public static void main(String[] args) {
        RemoteWebDriver[] webs =  {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver a: webs){
            a.navigate();
            a.open();
            a.close();
            a.open();
        }
    }
}

