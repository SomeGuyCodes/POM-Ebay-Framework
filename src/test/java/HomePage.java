import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseClass{
    WebDriver theOtherDriver;
    @Test
    public void home(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
            theOtherDriver = new ChromeDriver();
            theOtherDriver.get("https://www.ebay.com");
            theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[1]/span"));
            theOtherDriver.quit();

    }
    @Test
    public void saved(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theOtherDriver = new ChromeDriver();
        theOtherDriver.get("https://www.ebay.com");
        theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a"));
        theOtherDriver.quit();

    }
    @Test
    public void motors(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theOtherDriver = new ChromeDriver();
        theOtherDriver.get("https://www.ebay.com");
        theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]"));
        theOtherDriver.quit();

    }
    @Test
    public void expandMotors(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theOtherDriver = new ChromeDriver();
        theOtherDriver.get("https://www.ebay.com");
        theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]")).click();
        //theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]"));
        theOtherDriver.quit();

    }
    @Test
    public void expandFashion(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theOtherDriver = new ChromeDriver();
        theOtherDriver.get("https://www.ebay.com");
        theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")).click();
        //theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]"));
        theOtherDriver.quit();

    }
    @Test
    public void expandElectronics(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theOtherDriver = new ChromeDriver();
        theOtherDriver.get("https://www.ebay.com");
        theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")).click();
        //theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]"));
        theOtherDriver.quit();

    }
    @Test
    public void expandcollectiblesAndArt(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theOtherDriver = new ChromeDriver();
        theOtherDriver.get("https://www.ebay.com");
        theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")).click();
        //theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]"));
        theOtherDriver.quit();

    }
    @Test
    public void collectiblesAndArt(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eaney\\IdeaProjects\\EbayPom\\resources\\chromedriver.exe"); //resources/windows/chromedriver
        theOtherDriver = new ChromeDriver();
        theOtherDriver.get("https://www.ebay.com");
        theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")).click();
        //theOtherDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]"));
        theOtherDriver.quit();

    }
}
