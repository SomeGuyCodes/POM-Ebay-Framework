import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    WebDriver theDriver;
    @Test
    public void launchBrowser(){
        //try adding thread.sleep(2000) *and you must add the 'throws'
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.quit();//remove this if it doesn't work
    }

    @Test
    public void signIn (){
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a"));
        theDriver.quit();

    }
    @Test
    public void register(){
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a"));
        theDriver.quit();

    }
    @Test
    public void dailyDeals(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gh-p-1\"]/a"));
        theDriver.quit();

    }
    @Test
    public void brandOutlet(){
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gh-p-4\"]/a"));
        theDriver.quit();

    }

    @Test
    public void helpAndContact(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gh-p-3\"]/a"));
        theDriver.quit();

    }

    @Test
    public void sell(){
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gh-p-2\"]/a"));
        theDriver.quit();

    }
    @Test
    public void watchList(){
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gh-wl-click\"]/div/a[1]"));
        theDriver.quit();

    }
    @Test
    public void myEbay(){
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]"));
        theDriver.quit();

    }
    @Test
    public void notificationCart(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gh-Alerts-i\"]"));
        theDriver.quit();

    }
    @Test
    public void aboutEbay(){
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[1]/h3/a"));
        theDriver.quit();

    }
    @Test
    public void announcements(){
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[7]/a"));
        theDriver.quit();

    }
    @Test
    public void community(){
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[6]/h3/a"));
        theDriver.quit();

    }

    @Test
    public void coprightText(){
        theDriver = new ChromeDriver();
        theDriver.get("https://www.ebay.com");
        theDriver.findElement(By.xpath("//*[@id=\"gf-t-box\"]/table/tbody/tr[2]/td[1]"));
        theDriver.quit();

    }
}
